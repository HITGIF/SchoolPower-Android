package com.carbonylgroup.schoolpower.data

import android.content.Context
import android.util.Log
import com.carbonylgroup.schoolpower.R
import com.carbonylgroup.schoolpower.utils.Utils
import org.json.JSONObject
import java.util.*

/**
 * Created by Null on 2017/11/5.
 */

// Parse the student data fetched.
// if not succeed：IllegalArgumentException or JSONException may be thrown.
// the format of the JSON: (Sample)
/*
{
    "information": (StudentInformation),
    "sections": [
        (Subject)...
    ]
}
 */
class StudentData(context: Context, jsonStr: String, utils: Utils) {

    val studentInfo: StudentInformation
    val attendances: List<Attendance>
    val subjects: List<Subject>
    val disabled: Boolean
    val disabledTitle: String?
    val disabledMessage: String?
    val extraInfo: ExtraInfo

    init {
        val studentData = JSONObject(jsonStr)
        if (studentData.has("err")){
            Log.e("StudentData", studentData.toString())
            throw IllegalArgumentException("Server reported an error: " + studentData.getString("description"))
        }
        if (!studentData.has("information") || studentData.isNull("information")) { // not successful
            Log.e("StudentData", studentData.toString())
            throw IllegalArgumentException("Server returned an incorrect result. PowerSchool server is probably not available")
        }
        studentInfo = StudentInformation(studentData.getJSONObject("information"))
        val attendance = studentData.getJSONArray("attendances")
        attendances = (0 until attendance.length()).map { Attendance(attendance.getJSONObject(it)) }
        val sections = studentData.getJSONArray("sections")
        subjects = (0 until sections.length()).map { Subject(sections.getJSONObject(it), utils) }

        Collections.sort(subjects, Comparator<Subject> { o1, o2 ->
            if (o1.blockLetter == "HR(A-E)") return@Comparator -1
            if (o2.blockLetter == "HR(A-E)") return@Comparator 1
            o1.blockLetter.compareTo(o2.blockLetter)
        })
        disabled = studentData.has("disabled")
        if (disabled) {
            val disable = studentData.getJSONObject("disabled")
            disabledTitle = disable.getString("title") ?: "Access is disabled"
            disabledMessage = disable.getString("message") ?: context.getString(R.string.powerschool_disabled)
        } else {
            disabledTitle = null
            disabledMessage = null
        }
        extraInfo = if (studentData.has("additional")) {
            val additional = studentData.getJSONObject("additional")
            ExtraInfo(avatar = additional["avatar"].toString())
        } else {
            ExtraInfo(avatar = "")
        }
    }
}

class ExtraInfo(val avatar: String)

