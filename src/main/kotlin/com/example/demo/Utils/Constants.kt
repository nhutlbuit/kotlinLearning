package com.example.demo.Utils

import java.util.*


object Constants {

    val STATUS_ACTIVE = 1L
    val STATUS_INACTIVE = 0L

    val STATUS_ACTIVE_INT = 1
    val STATUS_INACTIVE_INT = 0

    val STATUS_PASS = 1
    val STATUS_FAILED = 0

    val STATUS_APPROVAL = 1
    val STATUS_REJECT = 0

    val ADMIN_ROLE = 1L
    val USER_ROLE = 2L

    val DOCUMENT_MAX_SIZE_UPLOAD: Long = 10 // MB

    // DATE FORMAT
    val DATE_FORMAT_DDMMYYYY = "dd-MM-yyyy"
    val DATE_FORMAT_DDMMMYY = "dd-MMM-yy"
    val DATE_FORMAT_DDMMMYYYY = "dd-MMM-yyyy"
    val DATE_FORMAT_YYYYMMDD = "yyyyMMdd"
    val DATE_FORMAT_ddMMyyyy = "dd/MM/yyyy"

    // FILE
    val DOT = "."
    val UNDER_LINE = "_"
    val FOLDER_REFERENCE_ID_FORMAT = "SL-%04d%02d%02d"

    // TRAINING CLASS

    val TRAINING_CLASS_CELL0 = "TT"
    val TRAINING_CLASS_CELL1 = "Tên khóa học"
    val TRAINING_CLASS_CELL2 = "Mã kỳ thi"
    val TRAINING_CLASS_CELL3 = "StartDate"
    val TRAINING_CLASS_CELL4 = "EndDate"
    val TRAINING_CLASS_CELL5 = "Ngày thi (*)"
    val TRAINING_CLASS_CELL6 = "Giờ thi (*)"
    val TRAINING_CLASS_CELL7 = "Tỉnh/thành phố (*)"
    val TRAINING_CLASS_CELL8 = "Quận/Huyện/Thành phố/Thị xã (*)"
    val TRAINING_CLASS_CELL9 = "Xã/Phường/Thị trấn (*)"
    val TRAINING_CLASS_CELL10 = "Số nhà, phố (*)"
    val TRAINING_CLASS_CELL11 = "SL thi dự kiến (*)"
    val TRAINING_CLASS_CELL12 = "Thi trực tuyến tập trung (*)"
    val TRAINING_CLASS_CELL13 = "Tự tổ chức thi trực tuyến"
    val TRAINING_CLASS_CELL14 = "CT Thi (*)"
    val TRAINING_CLASS_CELL15 = "Trainer"
    val TRAINING_CLASS_CELL16 = "Mã chi nhánh"

    val TRNGCLAS_EXAM_IDNUM_HEADER = "Số CMND"
    val TRNGCLAS_EXAM_SCORE_HEADER = "Điểm"

    val AVICAD_IDNUM_HEADER = "IDNUM"
    val AVICAD_AGTSTS_HEADER = "AGTSTS"

    val DOC_UPLOAD_TRAINING_CLASS = "DOC_00"
    val DOC_UPLOAD_AVICAD = "DOC_01"
    val DOC_UPLOAD_RESULT = "DOC_02"
    val DOC_UPLOAD_ATDE = "DOC_03"

    //ATTEMP TYPE
    val EXAM_TYPE_CODE = "EXAM_TYP"
    val ATTEMP_TIME_1ST = "01"

    //FIND AVICAD STATUS
    val CANDIDATE_STATUS_LOV_TYPE = "CAD_ST"
    val CANDIDATE_STATUS_AVICAD = "AVICAD"
    val CANDIDATE_STATUS_INIT = "INIT"
    val CANDIDATE_STATUS_APPROVED = "APPROVED"
    val CANDIDATE_STATUS_REJECT = "REJECT"


    //FIND TRAINING CLASS STATUS
    val TRAINING_CLASS_STATUS_LOV_TYPE = "CLAS_ST"

    val TRAINING_CLASS_INPROGESS = "CLAS_GO"
    val TRAINING_CLASS_TERMINATED = "CLAS_TER"
    val TRAINING_CLASS_PENDING = "CLAS_PEND"
    val TRAINING_CLASS_COMPLETED = "CLAS_COMP"

    //TRAINING CLASS ATTENDEE
    val ATDE_ATTEMP_LOV_TYPE = "ATED_TYP"
    val ATDE_ATTEMP_1ST = "01"
    val ATDE_ATTEMP_RETEST = "02"
    val ATDE_ATTEMP_REJOIN = "03"

    // FIND CONTACT TYPE
    val CLIENT_CONTACT_LOV_TYPE = "CNTCT_TYP"
    val CLIENT_CONTACT_EMAIL = "E"
    val CLIENT_CONTACT_MOBILE = "M"
    val POST_EMAIL_TEMPLATE = "@sales.sunlife.com.vn"


    //EXPORT
    val REPORT_HEADER_DATA = "attachment; filename=\"%s\""
    val REPORT_IRT_FILE_NAME = "IRT_checking.xlsx"
    val REPORT_DATA_KEY = "data"
    val REPORT_FONT_NAME = "Calibri"


    //GENDER TYPE
    val MALE = "Nam"
    val FEMALE = "Nữ"

    val SEX_MALE_CODE = "M"
    val SEX_FEMALE_CODE = "F"
    val SEX_LOV_TYPE = "GEN"

    //ADDRESS
    val ADDRESS_LOV_TYPE = "ADDR_TYP"
    val ADDRESS_RESIDENT_CODE = "RES"
    val ADDRESS_CONTACT_CODE = "CON"

    //MAIRTIAL
    val MARITIAL_LOV_TYPE = "MARL"
    val MARITIAL_MARRIED_CODE = "M"
    val MARITIAL_SINGLE_CODE = "S"

    //OCCUPATION LOVE TYPE
    val OCCUPATION_LOV_TYPE = "OCCP"

    //EDUCATION
    val EDU_LOV_TYPE = "EDU"
    val EDU_VOCATION_SCHOOL_CODE = "UNS"
    val EDU_HIGHT_SCHOOL_CODE = "HS"
    val EDU_COLLEGE_CODE = "COL"
    val EDU_UNIVERSITY_CODE = "UNI"
    val EDU_MASTER_CODE = "MAS"

    //EXAM TYPE
    val EXAMTYPE_TYPE = "EXAM_TYP"

    val IRT_DOCUMENT = "IRT"
    val ATTENDEE_LIST_CONFIRM = "Attendee_list_confirm"
    val ATTENDEE_LIST_TRACKING = "Attendee_list_tracking"

    val QUERY_GET_NEXTVAL = "Select %s.nextVal FROM DUAL"
    val SEQ_AGENT_CD = "SEQ_AGT_CD"

    //TRAINING TYPE - COURSE
    val COURSE_DLBH = "SSU"

    //Job titles
    val AGENT_TITLE_LOV = "AGT_TITLE"
    val AGENT_TITLE_CANDT = "CNDDT"
    val AGENT_TITLE_AGT = "AG"
    val AGENT_TITLE_PUM = "PUM"
    val AGENT_TITLE_UM = "UM"
    val AGENT_TITLE_SUM = "SUM"
    val AGENT_TITLE_BM = "BM"
    val AGENT_TITLE_ZD = "ZD"
    val AGENT_TITLE_TD = "TD"

    val UNIT_TEAM_CD = "UNT"
    val BRANCH_TEAM_CD = "BRANCH"
    val ZONE_TEAM_CD = "ZD"

    //Agent Status
    val AGENT_STATUS_LOV_TYP = "AGT_STAT_FLG"
    val AGENT_STATUS_ACTIVE = "1"
    val AGENT_STATUS_DISABLE = "0"
    val AGENT_STATUS_TERMINATED = "-1"

    //Deafult channel code
    val AGENT_DEFAULT_CHANNEL = "AGNT_CHNL"
    val AGENT_DEFAULT_CHANNEL_ID: Long = 1
    val AGENT_DEFAULT_HIERARCHY = "AGT_HIER"
    val AD_HIERARCHY = "AD_HIER"

    //Default for agent
    val AGENT_CATEGORY_TYPE_COD = "AGT_CAT"
    val AGENT_CATEGORY_DEFAULT_COD = "FA"
    val AGENT_AGRMT_TYPE_COD = "AGR_TYP"
    val AGENT_AGRMT_DEFAULT_COD = "CAN"

    val BUSINESS_TYPE_COD = "BUS_TYP"
    val STATE_MANAGEMENT_COD = "STA"
    val FINANCE_COD = "FIN"
    val INSURANCE_COD = "INS"
    val OTHER_COD = "OTH"
    val MANAGER_COD = "MAN"
    val DIRECTOR_COD = "DIR"
    val OTHER_PREFIX_COD = "O_"

    val MOVEMENT_LOV_TYPE = "MOV_TYP"
    val REINSTATE_LOV_CODE = "REINSTATE"
    val TERMINATED_LOV_CODE = "TERMINATE"
    val DEMOTE_LOV_CODE = "DEMOTE"
    val NEW_LOV_CODE = "ONBOARD"

    val REINSTATE_UNCHECK_DATE = 90
    val REINSTATE_CHECK_DATE = 180

    fun addDay(timestamp: Date?, amount: Int): Date? {
        if (timestamp != null) {
            val date = Date(timestamp!!.getTime())
            val calendar = Calendar.getInstance()
            calendar.time = date
            calendar.add(Calendar.DATE, amount)
            return calendar.time
        }
        return null
    }

    fun convertToStartOfDay(date: Date?): Date {
        val calendar = Calendar.getInstance()
        calendar.time = if (date == null) Date() else date
        calendar.set(Calendar.HOUR_OF_DAY, 0)
        calendar.set(Calendar.MINUTE, 0)
        calendar.set(Calendar.SECOND, 0)
        calendar.set(Calendar.MILLISECOND, 0)
        return calendar.time
    }

    fun convertToEndOfDay(date: Date?): Date {
        val calendar = Calendar.getInstance()
        calendar.time = if (date == null) Date() else date
        calendar.set(Calendar.HOUR_OF_DAY, 23)
        calendar.set(Calendar.MINUTE, 59)
        calendar.set(Calendar.SECOND, 59)
        calendar.set(Calendar.MILLISECOND, 0)
        return calendar.time
    }

    fun getDateCountBetween(start: Date, end: Date): Long {
        return (end.getTime() - start.getTime()) / (24 * 60 * 60 * 1000)
    }

    fun getDateBefore(dateInput: Date?, startOfDateFlag: Boolean): Date {
        val calendar = Calendar.getInstance()
        calendar.time = if (dateInput == null) Date() else dateInput
        calendar.add(Calendar.DATE, -1)
        return if (startOfDateFlag) {
            convertToStartOfDay(calendar.time)
        } else {
            convertToEndOfDay(calendar.time)
        }
    }
}