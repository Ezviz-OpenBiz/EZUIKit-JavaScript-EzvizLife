

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * <p>
 * 常量定义
 * </p>
 *
 * @author pengxiongwei 2014年7月9日 下午2:05:14
 * @version V1.0
 * @modificationHistory=========================逻辑或功能性重大变更记录
 * @modify by user: {修改人} 2014年7月9日
 * @modify by reason:{方法名}:{原因}
 */
public class Constant {
//	private static Properties properties;
//	static{
//		InputStream stream = null;
//		try {
//			stream = Constant.class.getClassLoader().getResourceAsStream("/constant.en.properties");
//			properties = new Properties();
//			properties.load(stream);
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			if(stream != null){
//				try{
//					stream.close();
//				} catch(IOException ex){
//					ex.printStackTrace();
//				}
//			}
//		}
//	}
	
//	private static String getMsg(String key){
//		return properties.getProperty(key, "");
//	}
	
    public static final String RESULT_CODE = "resultCode";

    public static final String RESULT_MSG = "resultMsg";

    public static final String RET_CODE = "retcode";

    public static final String CODE = "code";

    public static final String MSG = "msg";

    public static final String MSG_SEQ = "msgSeq";

    public static final String DATA = "data";

    public static final String FROM = "Hikvision";

    /**
     * ISAPI透明通道相关常量
     **/
    public static final String EZO_CODE = "EZO-Code";

    public static final String EZO_MESSAGE = "EZO-Message";

    public static final String EZO_ACCESSTOKEN = "EZO-AccessToken";

    public static final String EZO_DEVICESERIAL = "EZO-DeviceSerial";

    public static final String DEVICE_CHANNEL_ADDRESS_NOT_ASSOCIATE_OR_EXPIRE = "The device %s's channel address %s unbound or expired";

    public static final String EXPIRE_TIME_BETWEEN = "ExpireTime should between %s and %s";

    public static final String MSG_DEVICE_NOT_ASSOCIATE = "The two device %s and %s are unlinked.";

    public static final String MSG_FRIEND_RELATIONSHIP = "They are not friends";

    public static final String MSG_USER_CHECKCODE_LIMIT = "Get verification code too frequently.";

    public static final String MSG_USERINFOBO_IS_NULL = "UserInfoBo obeject is null！";

    public static final String MSG_INPUT_CORRECT_PHONE = "Enter the correct phone number.";

    public static final String MSG_SOME_ID_CORRESPONDENCE_MSG_NOT_EXISTS = "Some messages correspondent with massageId doesn't exist.";

    public static final String SUCCESS = "200"; //操作成功

    public static final String OPERAT_SUCCESS = "0";// 操作成功 与ys7兼容

    public static final String MSG_OPERAT_SUCCESS = "Operation succeeded";

    public static final String MSG_OPERAT_FALSE = "Operation failed";

    public static final int USER_CATEGORY_SUB_USER = 2;// 子账号

    public static final String PARAMETER_ERROR = "10001";// 请求参数错误

    public static final String MSG_PLANTYPE_NOT_EXIST = "PlanType is null";

    public static final String MSG_ACCESSTOKEN_IS_NULL = "AccessToken is null.";

    public static final String MSG_DEVICESERIAL_IS_NULL = "DeviceSerial is null.";

    public static final String MSG_DETECTORSERIAL_IS_NULL = "DetectorSerial is null.";

    public static final String MSG_AREA_IS_NULL = "Area is null";

    public static final String MSG_AREA_ILLEGAL = "Invalid area";

    public static final String MSG_AREA_TOO_LONG = "There are too many digits in parameter area, please check the length";

    public static final String MSG_AREA_OUT_OF_RANGE = "The max value in parameter area is out of range; please check the column of the device and calculate the value again";

    public static final String MSG_SN_IS_NULL = "Sn is null";

    public static final String MSG_DEVICEID_IS_NULL = "DeviceId is null";

    public static final String MSG_DETECTOR_SERIAL_ILLEGAL = "Invalid detectorSerial";

    public static final String MSG_DETECTOR_TYPE_IS_NULL = "DetectorType is null";

    public static final String MSG_DETECTOR_CODE_IS_NULL = "DetectorCode is null";

    public static final String MSG_IPCSERIAL_IS_NULL = "IpcSerial is null";

    public static final String MSG_IPC_SERIAL_ILLEGAL = "Invalid ipcSerial";

    public static final String MSG_OPERATION_IS_NULL = "Operation is null";

    public static final String MSG_OPERATION_ILLEGAL = "Invalid operation";

    public static final String MSG_DETECTOR_ENABLE_SET_ERROR = "Failed to set detector status.";

    public static final String MSG_DETECTORTYPE_NOT_EXISTS = "The detector model doesn't exist.";

    public static final String MSG_CHANNELNO_IS_NULL = "ChannelNo is null.";

    public static final String MSG_CHANNELNO_ILLEGAL = "Invalid channelNo";

    public static final String MSG_CHANNEL_IS_NULL = "Channel is null";

    public static final String MSG_CHANNEL_ILLEGAL = "Invalid channel";

    public static final String MSG_CAMERA_NAME_ILLEGAL = "Invalid cameraName";

    public static final String MSG_CAMERA_NO_ILLEGAL = "Invalid cameraNo";

    public static final String MSG_ENABLE_IS_NULL = "Enable is null";

    public static final String MSG_ENABLE_ILLEGAL = "Invalid enable";

    public static final String MSG_PERIOD_IS_NULL = "Period is null";

    public static final String MSG_PERIOD_ILLEGAL = "Invalid period";

    public static final String MSG_SEGIDS_IS_NULL = "SegIds is null";

    public static final String MSG_TIMEZONE_IS_NULL = "Tiemzone is null";

    public static final String MSG_TIMEZONE_ILLEGAL = "Invalid timezone";

    public static final String MSG_TIMEFORMAT_IS_NULL = "Timeformat is null";

    public static final String MSG_TIMEFORMAT_ILLEGAL = "Invalid timeformat";

    public static final String MSG_MONTH_IS_NULL = "Month is null";

    public static final String MSG_MONTH_ILLEGAL = "Invalid month";

    public static final String MSG_DAY_IS_NULL = "Day is null";

    public static final String MSG_DAY_ILLEGAL = "Invalid day";

    public static final String MSG_ISENCRYPT_IS_NULL = "IsEncrypt is null";

    public static final String MSG_IS_ENCRYPT_ILLEGAL = "Invalid isEncrypt. The value can only be 0 or 1";

    public static final String MSG_DAYLIGHTSAVING_ILLEGAL = "Invalid daylightSaving";

    public static final String MSG_DEVICE_FIND_ERROR = "Failed to search device information!";

    public static final String MSG_DEVICE_NOT_FOUND_THROUGH_DEVICESERIAL = "The serial number has no device information";

    public static final String MSG_DOMAIN_ERROR = "Parameter domain error";

    public static final String MSG_CMD_IS_NULL = "Cmd is null";

    public static final String MSG_CMD_ILLEGAL = "Cmd value ranges from 18688 to 18841.";

    public static final String MSG_TRANSFERXML_IS_NULL = "TransferXml is null";

    public static final String MSG_CMDPORT_ERROR = "Invalid cmdPort";

    public static final String MSG_HTTPPORT_ERROR = "Invalid httpPort";

    public static final String MSG_SAFEMODE_IS_NULL = "SafeMode is null";

    public static final String MSG_SAFEMODE_ILLEGAL = "Invalid safeMode";

    public static final String MSG_NEWNAME_IS_NULL = "NewName is null";

    public static final String MSG_NEWNAME_ILLEGAL = "Invalid newName";

    public static final String MSG_DIRECTION_IS_NULL = "Direction is null";

    public static final String MSG_DIRECTION_IS_ILLEGAL = "Invalid direction";

    public static final String MSG_SPEED_IS_NULL = "Speed is null";

    public static final String MSG_SPEED_ILLEGAL = "Invalid speed";

    public static final String MSG_COMMAND_IS_NULL = "Command is null";

    public static final String MSG_COMMAND_ILLEGAL = "Invalid command";

    public static final String MSG_INDEX_IS_NULL = "Index is null";

    public static final String MSG_INDEX_ILLEGAL = "Invalid index";

    public static final String MSG_STARTTIME_IS_NULL = "StartTime is null";

    public static final String MSG_START_TIME_ILLEGAL = "Invalid startTime format";

    public static final String MSG_ENDTIME_IS_NULL = "EndTime is null";

    public static final String MSG_END_TIME_ILLEGAL = "Invalid endTime format";

    public static final String MSG_STOPTIME_IS_NULL = "StopTime is null";

    public static final String MSG_STOP_TIME_ILLEGAL = "Invalid stopTime format";

    public static final String MSG_TIMEPARAM_IS_NULL = "Parameter time is null";

    public static final String MSG_TIME_PARAM_ILLEGAL = "Invalid time format";

    public static final String MSG_ENDTIME_BEYOND_STARTTIME_ERROR = "StartTime must be earlier than endTime.";

    public static final String MSG_STOPTIME_BEYOND_STARTTIME_ERROR = "StartTime must be earlier than stopTime.";

    public static final String MSG_STARTTIME_ENDTIME_INTERVAL_ERROR = "The time period between the startTime and the stopTime cannot be more than 1 day!";

    public static final String MSG_USERID_IS_NULL = "UserId is null";

    public static final String MSG_USERNAME_IS_NULL = "UserName is null";

    public static final String MSG_USER_NAME_ILLEGAL = "Invalid userName";

    public static final String MSG_VIDEOLEVEL_IS_NULL = "VideoLevel is null";

    public static final String MSG_VIDEOLEVEL_ILLEGAL = "Invalid videoLevel";

    public static final String MSG_VOICEMODE_IS_NULL = "VoiceMode is null";

    public static final String MSG_MSG_VOICE_MODE_ILLEGAL = "Invalid voiceMode";

    public static final String MSG_CAMERAID_IS_NULL = "CameraId is null";

    public static final String MSG_QUALITY_IS_NULL = "Quality is null";

    public static final String MSG_QUALITY_ILLEGAL = "Invalid quality";

    public static final String MSG_MSGSEQ_IS_NULL = "MsgSeq is null";

    public static final String MSG_MSGSEQ_NEED_UUID = "The type of msgSeq is UUID";

    public static final String MSG_MESSAGE_IS_NULL = "Message content is null";

    public static final String MSG_TYPE_IS_NULL = "Type is null";

    public static final String MSG_TYPE_ILLEGAL = "Invalid type";

    public static final String MSG_DURATION_ILLEGAL = "Invalid duration";

    public static final String MSG_DURATION_IS_NULL = "Duration is null";

    public static final String MSG_WIDTH_ILLEGAL = "Invalid width";

    public static final String MSG_HEIGHT_ILLEGAL = "Invalid height";

    public static final String MSG_QRCOLOR_ILLEGAL = "Invalid qrColor";

    public static final String MSG_BGCOLOR_ILLEGAL = "Invalid bgColor";

    public static final String MSG_DATA_IS_NULL = "Data is null";

    public static final String MSG_DATA_ILLEGAL = "Invalid data";

    public static final String MSG_DATA_NEED_JSON = "The format of data is json";

    public static final String MSG_DATATYPE_IS_NULL = "DataType is null";

    public static final String MSG_APPKEY_IS_NULL = "AppKey is null";

    public static final String MSG_APPSECRET_IS_NULL = "AppSecret is null";

    public static final String MSG_APPINFO_IS_NULL = "AppInfo is null";

    public static final String MSG_OPENUSERID_IS_NULL = "OpenUserId is null";

    public static final String MSG_OPENID_IS_NULL = "openId is null";

    public static final String MSG_ISDEFENCE_IS_NULL = "IsDefence is null";

    public static final String MSG_STATE_ILLEGAL = "Invalid state";

    public static final String MSG_TRANSMIT_DATE_LENGTH_LIMIT = "The length of transmission data reach the upper limit %s B";

    public static final String MSG_DEFENCE_SET_FAILED = "Failed to configure arming and disarming settings for the device";

    public static final String MSG_IPC_IS_DEFENCE_ERROR = "Failed to configure arming and disarming settings for the device. For IPC the isDefense value can only be 0 or 1";

    public static final String MSG_IS_DEFENCE_ERROR = "Failed to configure arming and disarming setting. For the devices with defensive capability, the isDefence value can only be 0, 8, or 16";

    public static final String MSG_DEVICENAME_IS_NULL = "DeviceName is null";

    public static final String MSG_DEVICENAME_ILLEGAL = "Invalid deviceName";

    public static final String MSG_DEVICELIST_IS_NULL = "The device list is null";

    public static final String MSG_DEVICESERIAL_DOMAIN_ALL_EMTPY = "DeviceSerial and domain cannot be null at the same time";

    public static final String MSG_DEVICESERIAL_DOMAIN_ERROR_HIDDNS_NULL = "DeviceSerial or domain error, hiddns is empty.";

    public static final String MSG_DEVICESERIAL_ERROR_HIDDNS_NULL = "DeviceSerial error, hiddns is empty.";

    public static final String MSG_ACCOUNTID_ACCOUNTNAME_ALL_EMTPY = "Both accountId and accountName are null.";

    public static final String MSG_POLICY_IS_NULL = "Policy is null";

    public static final String MSG_STATEMENT_IS_NULL = "Statement is null";

    public static final String MSG_POLICY_PARSE_ERROR = "Parse policy error";

    public static final String MSG_DEVICES_NOT_BELONG_TO_USER = "Device %s doesn't belong to the EZVIZ user.";

    public static final String MSG_ACCOUNT_IS_NULL = "Account is null";//被分享账户，可以是邮箱地址或手机号码（包含国家代码）或不是全数字的用户名

    public static final String MSG_ACCOUNTID_IS_NULL = "AccountId is null";//子账户中的子账户ID

    public static final String MSG_ACCOUNTNAME_IS_NULL = "AccountName is null";

    public static final String MSG_ACCOUNTID_ERROR = "accountId error";

    public static final String MSG_ACCOUNT_NAME_ILLEGAL = "Invalid sub-account name. The sub-account name should contain 4 to 40 characters (letters, number, and underscore.";

    public static final String MSG_LANGUAGE_ILLEGAL = "Invalid language. Language can only be english, simpcn, or empty.";

    public static final String MSG_CAMERANAME_IS_NULL = "CameraName is null";

    public static final String MSG_VALIDATE_CODE_IS_NULL = "ValidateCode is null";

    public static final String MSG_VALUE_IS_NULL = "Value is null";

    public static final String MSG_VALUE_ILLEGAL = "Invalid value";

    public static final String MSG_PHONE_IS_NULL = "Phone is null";

    public static final String MSG_PHONE_ILLEGAL = "Invalid phone";

    public static final String MSG_PASSWORD_IS_NULL = "password is null";

    public static final String MSG_PASSWORD_ILLEGAL = "Invalid password. Password must be 32 characters of lower-case letters processed via MD5 algorithm";

    public static final String MSG_OLDPASSWORD_IS_NULL = "OldPassword is null";

    public static final String MSG_NEWPASSWORD_IS_NULL = "NewPassword is null";

    public static final String MSG_NEW_PASSWORD_ILLEGAL = "Invalid newPassword. newPassword must be 32 characters of lower-case letters processed via MD5 algorithm";

    public static final String MSG_NEW_PASSWORD_LENGTH_EXCEED = "NewPassword length exceeds the upper limit";

    public static final String MSG_UPDATE_VIDEO_PASSWORD_FAILED = "Failed to change video encryption password. Device returns:";

    public static final String MSG_NOTICEID_IS_NULL = "NoticeId is null";

    public static final String MSG_SSID_IS_NULL = "Ssid is null";

    public static final String MSG_EXPIRETIME_IS_NULL = "ExpireTime is null";

    public static final String MSG_EXPIRE_TIME_ILLEGAL = "Invalid expireTime";

    public static final String MSG_ALARMID_IS_NULL = "AlarmId is null";

    public static final String MSG_ALARMTYPE_IS_NULL = "The alarm type (alarmType) is null";

    public static final String MSG_ALARM_TYPE_ILLEGAL = "Invalid alarm type(alarmType)";

    public static final String MSG_ALARMSTATUS_IS_NULL = "The alarm message status(status) is empty";

    public static final String MSG_ALARM_STATUS_ILLEGAL = "Invalid alarm message status (status)";

    public static final String MSG_STATUS_IS_NULL = "Status is null";

    public static final String MSG_STATUS_ILLEGAL = "Invalid status";

    public static final String MSG_MESSAGEID_IS_NULL = "MessageId is null";

    public static final String MSG_CONTENTTYPE_IS_NULL = "ContentType is null";

    public static final String MSG_CONTENT_TYPE_ILLEGAL = "Invalid contentType";

    public static final String MSG_DISK_INDEX_ILLEGAL = "Invalid diskIndex";

    public static final String MSG_FORMAT_DISK_FAILED = "Failed to format the device disk";

    public static final String MSG_VERSION_IS_NULL = "Version is null";

    public static final String MSG_VERSION_NOT_EXIST = "Version doesn't exist";

    public static final String MSG_OVER_ADDRESS_EXPIRE_TIME = "Exceeding the address expiration time";

    public static final String MSG_GET_VIDEO_IS_NULL = "The obtained video file is empty";

    public static final String MSG_GET_VIDEO_FAILED = "Failed to get local video files";

    public static final String MSG_VALIDATE_CODE_ERROR = "Detector verification code error";

    public static final String MSG_UPDATECAMERANAME_ERROR = "Failed to edit camera name";

    public static final String MSG_SWITCH_SET_ERROR = "Failed to set the switch status";

    public static final String MSG_PASSWORD_RESET_FAILED = "Failed to reset password";

    public static final String MSG_PASSWORD_CHANGE_FAILED = "Failed to change password";

    public static final String MSG_LOGOUT_FAILED = "Failed to exit";

    public static final String MSG_GET_USER_INFO_FAILED = "Getting user's basic information error";

    public static final String MSG_C6_INDEX_RANGE_ERROR = "The index of C6 device ranges from 1 to 12";

    public static final String MSG_PARAMETER_ERROR = "Request parameter error";

    public static final String MSG_PARAM_IS_NULL = "Request parameter is null!";

    public static final String MSG_PUBLIC_PARAM_INCOMPLETE = "Incomplete public parameter";

    public static final String MSG_PUBLIC_PARAM_ERROR = "Common parameter error";

    public static final String MSG_SYSTEM_ERROR = "System error";

    public static final String MSG_PARAM_NODE_ERROR = "Request data format error";

    public static final String MSG_UUID_NOT_REGISTERED = "UUID is unregistered";

    public static final String MSG_IPC_DETECTOR_ASSOCIATE_FAILED = "Failed to link the IPC and the detector";

    public static final String ACCESS_TOCKEN_ERROR = "10002";// access_tocken异常

    public static final String MSG_ACCESS_TOCKEN_ERROR = "AccessToken expired or error.";// access_tocken异常

    public static final String ACCESS_TOCKEN_EXPIRED = "10003";// access_tocken过期

    public static final String USER_NOT_EXISTS = "10004";// 用户不存在

    public static final String MSG_USER_NOT_EXISTS = "The user doesn't exist.";

    public static final String APP_KEY_ERROR = "10005";//  appKey异常

    public static final String MSG_APP_KEY_ERROR = "appKey error.";// appKey异常

    public static final String IP_LIMIT = "10006";// ip受限

    public static final String MSG_IP_LIMIT = "Restricted IP address.";

    public static final String CALL_TIMES_LIMIT = "10007";// 调用次数达到上限

    public static final String MSG_CALL_TIMES_LIMIT = "Call times reach the upper-limit.";// 调用次数达到上限

    public static final String SIGN_ERROR = "10008";// 签名错误

    public static final String MSG_SIGN_ERROR = "Signature error.";

    public static final String MSG_SIGN_IS_NULL = "The signature is null.";

    public static final String MSG_SIGN_VALUE_IS_DIFFERENT = "Inconsistent signatures.";

    public static final String SIGN_PARAMETER_ERROR = "10009";// 签名参数错误

    public static final String MSG_SIGN_PARAMETER_ERROR = "Parameter signature error.";

    public static final String MSG_SIGN_CHECK_PARAM_ERROR = "The signature verification module failed to verify parameters.";

    public static final String SIGN_TIME_OUT = "10010";// 签名超时

    public static final String MSG_SIGN_TIME_OUT = "Signature timeout.";

    public static final String UNBIND = "10011";// 获取accessToken时发现第三方账户与萤石账号没有绑定关系

    public static final String MSG_USER_UNBIND = "EZVIZ user is unbind.";

    public static final String MSG_UNBIND = "EZVIZ service is unabled.";

    public static final String BINDED = "10012";// 第三方账户与萤石账号已经绑定

    public static final String MSG_BINDED_PHONE = "The phone has been bound with the appKey.";

    public static final String UNACCESSURL = "10013";// 半公开接口，您的应用没有权限调用

    public static final String MSG_UNACCESSURL = "Your application has no permission to call the API.";

    public static final String APPKEY_OAUTHID_PHONE_NOT_BIND = "10014";// APPKEY下对应的第三方userId和phone未绑定

    public static final String MSG_APPKEY_OAUTHID_PHONE_NOT_BIND = "The third-party userId and phone under the appKey are not bound with each other.";

    public static final String USER_NOT_GRANT = "10015";

    public static final String MSG_USER_NOT_GRANT = "The user doesn't granted ..";

    public static final String BIND_FAIL = "10016";// 绑定失败

    public static final String APP_KEY_NOT_EXISTS = "10017";// appKey不存在

    public static final String MSG_APP_KEY_NOT_EXISTS = "AppKey doesn't exist";

    public static final String MSG_APP_KEY_NON_NULL = "Authenticating transparent channel permission failed.";// appKey不存在

    public static final String CODE_APPKEY_TOKEN_NOT_MATCH = "10018";// AccessToken与Appkey不匹配

    public static final String MSG_APPKEY_TOKEN_NOT_MATCH = "AccessToken mismatches Appkey.";

    public static final String DDNS_PWD_ERROR = "10019";// 密码错误

    public static final String MSG_DDNS_PWD_ERROR = "Incorrect password.";

    public static final String CODE_METHOD_NOT_NULL = "10020";// 请求方法为空

    public static final String MSG_METHOD_IS_NULL = "Request method is null.";

    public static final String MSG_METHOD_NOT_EXISTS = "Method doesn't exist.";

    public static final String TICKET_NOT_AUTH = "10021";// ticket校验失败

    public static final String TRANSPARENT_DESTINATION_ERROR = "10022";// 透传目的地非法

    public static final String MSG_TRANSPARENT_DESTINATION_ERROR = " Invalid destination of transparent transmission.";

    public static final String TRANSPARENT_NOT_EXISTS = "10024";// 无透传权限

    public static final String MSG_TRANSPARENT_AUTH_ERROR = "Invalid transparent transmission permission.";

    public static final String MSG_APP_KEY_NON_AUTH = "Failed to authenticate the transparent channel permission.";// appKey不存在

    public static final String APPKEY_TRANSPARENT_FORBDEN = "10025";// appKey被禁止使用通明通道

    public static final String MSG_APPKEY_TRANSPARENT_FORBDEN = "AppKey is prohibited to use the transparent channel.";

    public static final String APPKEY_TRANSPARENT_STOP = "10026";// appKey被暂停使用通明通道

    public static final String MSG_APPKEY_TRANSPARENT_STOP = "AppKey is disabled from using the transparent channel.";

    public static final String FAIL_THREE_TIMES_STOP_ONE_HOUR = "10027";// 失败3次暂停使用1小时

    public static final String MSG_FAIL_THREE_TIMES_STOP_ONE_HOUR = "The account will be frozen for 1 hour after 3 failed password attempts.";

    public static final String CODE_OPEN_TRANSPARENT_PARSE_FAIL = "10028";// 解析callback失败

    public static final String CODE_CAPTURE_CALL_TIMES_LIMIT = "10028";

    public static final String MSG_CAPTURE_CALL_TIMES_LIMIT = "The capture interface call frequency exceeds the upper-limit";

    public static final String CODE_OPEN_FREQUENCY_EXCEED_LIMIT = "10029";// 调用频度超限

    public static final String MSG_OPEN_FREQUENCY_EXCEED_LIMIT = "The call frequency exceeds the upper-limit";// 调用频度超限

    public static final String CODE_APPKEY_SECRET_NOT_MATCH = "10030";// appkey和appsecret不匹配

    public static final String MSG_APPKEY_SECRET_NOT_MATCH = "Appkey mismatches appsecret";// appkey和appsecret不匹配

    public static final String CODE_OPEN_ACCOUNT_HAS_NOT_PERMISSION = "10031";// 子账户没有权限

    public static final String MSG_OPEN_ACCOUNT_HAS_NOT_PERMISSION = "The sub-account or the EZVIZ user has no permission";// 子账户或萤石用户没有权限

    public static final String CODE_OPEN_ACCOUNT_NOT_EXIST = "10032";// 子账号不存在

    public static final String MSG_OPEN_ACCOUNT_NOT_EXIST = "The sub-account doesn't exist";// 子账号不存在

    public static final String CODE_OPEN_ACCOUNT_POLICY_NOT_EXIST = "10033";// 子账号未设置授权策略

    public static final String MSG_OPEN_ACCOUNT_POLICY_NOT_EXIST = "The sub-account hasn't set authorization policy.";// 子账号未设置授权策略

    public static final String CODE_OPEN_ACCOUNT_EXIST = "10034";// 子账号已存在

    public static final String MSG_OPEN_ACCOUNT_EXIST = "The sub-account already exists.";// 子账号已存在

    public static final String CODE_GET_ACCESSTOKEN_OF_OPEN_ACCOUNT = "10035";// 获取子账户AccessToken异常

    public static final String MSG_GET_ACCESSTOKEN_OF_OPEN_ACCOUNT = "Getting sub-account AccessToken error.";// 获取子账户AccessToken异常

    public static final String CODE_OPEN_ACCOUNT_DISABLED = "10036";// 子账号被禁用

    public static final String MSG_OPEN_ACCOUNT_DISABLED = "The sub-account is frozen.";

    public static final String CODE_NO_ACCESS_TO_CAPTURE = "10051";// 无权限进行抓图

    public static final String MSG_NO_ACCESS_TO_CAPTURE = "No permission to capture picture.";

    /**************** 与设备相关异常 *******************/

    public static final String MSG_UPGRADE_DEVICE_ERROR = "Failed to upgrade device.";

    public static final String CAMERA_NOT_EXIST = "20001";// 通道不存在

    public static final String MSG_CAMERA_NOT_EXIST = "The camera doesn't exist.";// 通道不存在

    public static final String MSG_DEVICE_NOT_EXIST_OR_CAMERA_ERROR = "The device doesn't exist or camera error.";

    public static final String DEVICE_NOT_EXIST = "20002";// 设备不存在

    public static final String MSG_DEVICE_NOT_EXIST = "The device doesn't exist.";

    public static final String MSG_DEVICE_NOT_ADDED = "The device is not added.";

    public static final String FEATURE_CODE_LOW_VERSION = "20003"; // 硬件特征码为空，版本过低

    public static final String MSG_FEATURE_CODE_LOW_VERSION = " Attribute code of the hardware is empty. The current version is too low.";

    public static final String FEATURE_CODE_MISMATCH = "20004"; // 硬件特征码检测失败，版本过低

    public static final String MSG_FEATURE_CODE_MISMATCH = "Failed to authenticate attribute code of the hardware. The current version is too low.";

    public static final String FEATURE_CODE_OPERATION_FAIL = "20005"; // 硬件特征码操作失败

    public static final String MSG_FEATURE_CODE_OPERATION_FAIL = "Operation of hardware attribute code failed.";

    public static final String NET_ERROR = "20006";// 网络异常

    public static final String MSG_NET_ERROR = "Device network error.";

    public static final String DEVICE_OFF_LINE = "20007";// 设备不在线

    public static final String MSG_DEVICE_OFF_LINE = "The device is offline.";

    public static final String DEVICE_SO_TIMEOUT = "20008";// 设备响应超时

    public static final String MSG_DEVICE_SO_TIMEOUT = "Device response timeout.";

    public static final String DEVICE_CANNOT_ADD_BY_SUB_USER = "20009"; // 子账户不能添加设备

    public static final String MSG_DEVICE_CANNOT_ADD_BY_SUB_USER = "The sub-account cannot add device.";

    public static final String DEVICE_INVALIDATE_CODE = "20010";// 设备验证码错误

    public static final String MSG_DEVICE_INVALIDATE_CODE = "Incorrect device verification code.";

    public static final String DEVICE_EXCEPTION = "20011"; // 设备异常

    public static final String MSG_DEVICE_EXCEPTION = "Device error.";

    public static final String DEVICE_ADD_FAILED = "20012"; // 设备添加失败

    public static final String MSG_DEVICE_ADD_FAILED = "Failed to add device.";

    public static final String DEVICE_HAS_ADD = "20013";// 设备已被别人添加

    public static final String MSG_DEVICE_HAS_ADD = "The device has been added by another person.";

    public static final String DEVICE_SERIAL_ILLEGAL = "20014"; // 设备序列不正确

    public static final String MSG_DEVICE_SERIAL_ILLEGAL = "Invalid deviceSerial!";

    public static final String DEVICE_UNSUPPORT = "20015"; // 设备不支持

    public static final String MSG_DEVICE_UNSUPPORT = "Unsupported by the device.";

    public static final String DEVICE_IS_FORMATTING = "20016";// 当前设备正在格式化

    public static final String MSG_DEVICE_IS_FORMATTING = "The current device is formatting...";

    public static final String DEVICE_HAS_ADD_OWN = "20017"; // 设备已经被自己添加

    public static final String MSG_DEVICE_HAS_ADD_OWN = "The device has been added by yourself.";

    public static final String USER_DEVICE_NOT_EXIST = "20018"; // 该用户不拥有该设备

    public static final String USER_DOES_NOT_PERMISSION = "The user has no permission.";

    public static final String MSG_USER_DEVICE_NOT_EXIST = "The user doesn't own the device."; // 该用户不拥有该设备

    public static final String CLOUD_SERVICE_NOT_SUPPORT = "20019"; // 设备不支持云存储服务

    public static final String DEVICE_ON_LINE_ADD_OWN = "20020"; // 设备在线，被自己添加

    public static final String MSG_DEVICE_ON_LINE_ADD_OWN = "The device is online. The device has been added by yourself.";

    public static final String DEVICE_ON_LINE_NOT_ADD = "20021";// 设备在线，但是未被用户添加

    public static final String MSG_DEVICE_ON_LINE_NOT_ADD = "The device is online but hasn't been added by user.";

    public static final String DEVICE_ON_LINE_ADD_OHTER = "20022";// 设备在线，但是已经被别的用户添加

    public static final String MSG_DEVICE_ON_LINE_ADD_OHTER = "The device is online. The device has been added by another user.";

    public static final String DEVICE_OFF_LINE_NOT_ADD = "20023";// 设备不在线，未被用户添加

    public static final String MSG_DEVICE_OFF_LINE_NOT_ADD = "The device is offline and hasn't been added by user.";

    public static final String DEVICE_OFF_LINE_ADD_OTHER = "20024";// 设备不在线，但是已经被别的用户添加

    public static final String MSG_DEVICE_OFF_LINE_ADD_OHTER = "The device is offline. The device has been added by another user.";

    public static final String DEVICE_PACKAGEINFO_NOT_EXISTS = "20028";// 设备固件升级包不存在

    public static final String MSG_DEVICE_PACKAGEINFO_NOT_EXISTS = "The device firmware upgrading package doesn't exist.";// 设备固件升级包不存在

    /**************** 与视频分享视频广场相关异常 *******************/

    public static final String MSG_FAVORITEID_IS_NULL = "FavoriteId is null";

    public static final String MSG_FAVORITE_SAVE_FAILED = "Failed to add the video to the Favorites";

    public static final String MSG_DELETE_FAVORITE_SAVE_FAILED = "Failed to delete the video to the Favorites";

    public static final String MSG_VIDEO_REVIEW_FAILED = "The video is not approved!";

    public static final String MSG_SQIAREID_NOT_BELONG_TO_APPKEY = "The squareId video has no affiliation with the appKey";

    public static final String MSG_VIEWSORT_ILLEGAL = "Invalid viewSort";

    public static final String MSG_FAVORITESORT_ILLEGAL = "Invalid favoriteSort";

    public static final String MSG_CAMERANAME_SORT_ILLEGAL = "Invalid cameraNameSort";

    public static final String MSG_RANGESORT_ILLEGAL = "Invalid rangeSort.";

    public static final String MSG_DESCRIPTION_IS_NULL = "Description is null";

    public static final String MSG_TITLE_IS_NULL = "Title is null";

    public static final String MSG_TAG_IS_NULL = "Tag is null";

    public static final String MSG_TIMEENABLED_IS_NULL = "TimerEnabled is null";

    public static final String MSG_TIME_ENABLED_ILLEGAL = "Invalid timerEnabled";

    public static final String MSG_TIMEPERIOD_IS_NULL = "TimerPeriod is null";

    public static final String MSG_TIMESTART_IS_NULL = "TimerStart is null";

    public static final String MSG_TIMEEND_IS_NULL = "TimerEnd is null";

    public static final String MSG_LONGITUDE_ILLEGAL = "Invalid longitude";

    public static final String MSG_LATITUDE_ILLEGAL = "Invalid latitude";

    public static final String MSG_ISOPENSOUND_IS_NULL = "IsOpenSound is null";

    public static final String MSG_IS_OPEN_SPOUND_ILLEGAL = "Invalid isOpenSound.";

    public static final String MSG_COORDINATETYPE_ILLEGAL = "Invalid coordinateType.";

    public static final String MSG_BELONG_TYPE_ILLEGAL = "Invalid belongType.";

    public static final String MSG_RANGE_ILLEGAL = "Invalid range.";

    public static final String MSG_LOCATION_CHANGE_FAILED = "Failed to switch coordinates.";

    public static final String MSG_CITYKEY_IS_NULL = "CityKey is null";

    public static final String MSG_CITYNAME_IS_NULL = "CityName is null";

    public static final String MSG_CITYCONFIG_IS_NULL = "CityConfig is null";

    public static final String MSG_SQUAREID_IS_NULL = "SquareId is null";

    public static final String MSG_SQUAREIDS_IS_NULL = "SquareIds is null";

    public static final String MSG_SQUAREID_ILLEGAL = "Invalid squareId";

    public static final String MSG_PLAYURL_IS_NULL = "PlayUrl is null";

    public static final String MSG_USER_STATISTIC_FAILED = "User statistics failed.";

    public static final String MSG_UPLOAD_CITY_CONFIG_FAILED = "Failed to upload city settings.";

    public static final String MSG_GET_CONFIG_CITY_LIST = "Failed to search city information.";

    public static final String MSG_PLAYURL_INFO_IS_NULL = "No URL information.";

    public static final String MSG_DELETE_SQUAREID_ERROR = "Canceling sharing error.";

    public static final String MSG_CAMERA_THIRD_INFO_NOT_EXIST = "The third-party information of the video doesn't exist.";

    public static final String MSG_ADDVIEWEDCOUNT_FAILED = "Failed to add view times of Gallery";

    public static final String MSG_VIDEOID_IS_NULL = "VideoId is null";

    public static final String MSG_PUBLICTYPE_ERROR = "PublicType is null or invalid";

    public static final String MSG_CATEGORY_ILLEGAL = "Invalid category";

    public static final String CODE_CAMERA_APPLY_DUPLICATED = "20025";// 重复申请分享

    public static final String MSG_CAMERA_APPLY_DUPLICATED = "Reapply sharing.";// 重复申请分享

    public static final String CODE_DEMOCAMERA_NOT_EXIST = "20026";// 视频广场不存在该视频

    public static final String MSG_DEMOCAMERA_NOT_EXIST = "The video is not found in the Gallery.";// 视频广场不存在该视频

    public static final String CODE_VIDEO_TRANSCODE_ERROR = "20027";// 视频转码失败

    public static final String MSG_VIDEO_TRANSCODE_ERROR = "Video transcoding failed.";

    public static final String DEVICE_OFF_LINE_ADD_OWN = "20029"; // 设备不在线，但是已经被自己添加

    public static final String MSG_DEVICE_OFF_LINE_ADD_OWN = "The device is offline. The device has been added by yourself.";

    public static final String USER_DEMOCAMERA_NOT_EXIST = "20030"; // 该用户不拥有该视频广场视频

    public static final String MSG_USER_DEMOCAMERA_NOT_EXIST = "The user doesn't own the Gallery video.";

    public static final String CODE_FEATURE_CODE_ERROR = "20031";// 终端绑定验证失败

    public static final String MSG_FEATURE_CODE_ERROR = "Please disable the binding of the terminal on EZVIZ client.";

    public static final String CODE_USER_CAMERA_NOT_EXIST = "20032";// 该用户下通道不存在

    public static final String MSG_USER_CAMERA_NOT_EXIST = "The channel you selected doesn't exist.";

    public static final String CODE_CONNOT_SAVE_YOUR_OMN_DEMOCAMERA = "20033";// 无法收藏自己分享的视频

    public static final String MSG_CONNOT_SAVE_YOUR_OMN_DEMOCAMERA = "The video shared by yourself cannot be added to Favorites.";

    public static final String CODE_USER_NON_DEVICE = "20034";// 该用户下无设备

    public static final String MSG_USER_NON_DEVICE = "No channel exist.";

    public static final String CODE_USER_FEEDBACK_FAILED = "20090";

    public static final String MSG_USER_FEEDBACK_FAILED = "User feedback failed.";

    public static final String CODE_APP_DOWNLOAD_FAILED = "20095";

    public static final String MSG_APP_DOWNLOAD_FAILED = "Failed to download APP package.";

    public static final String CODE_APP_VERSION_DEL_FAILED = "20096";

    public static final String MSG_APP_VERSION_DEL_FAILED = "Failed to delete APP package information.";

    /**************** 与好友分享相关异常 *******************/

    public static final String MSG_GET_FRIEND_INFO_FAILED = "Failed to get friend's information";

    public static final String MSG_FRIEND_INFO_NOT_EXISTS = "Friend information doesn't exist";

    public static final String MSG_FRIENDID_IS_NULL = "FriendId is null";

    public static final String MSG_SHARENAME_IS_NULL = "ShareName is null";

    public static final String MSG_SHAREID_IS_NULL = "ShareId is null";

    public static final String MSG_SHARE_CAMERA_JSON_ILLEGAL = "Invalid shareCameraJson";

    public static final String MSG_SHARE_DEVICE_JSON_ILLEGAL = "Invalid shareDeviceJson";

    public static final String MSG_SHARE_CAMERA_JSON_PARSE_ERROR = "ShareCameraJson format parsing error!";

    public static final String MSG_GROUPID_IS_NULL = "GroupId is null";

    public static final String MSG_IS_TOP_ILLEGAL = "Invalid isTop";

    public static final String MSG_NO_FRIEND_IN_GROUP = "You have no friends in the group";

    public static final String CODE_CAMERA_INVITE_OWN = "20101";// 视频分享给本人

    public static final String MSG_CAMERA_INVITE_OWN = "The video cannot be shared to yourself";

    public static final String CODE_INVITE_INFO_NOT_EXIST = "20102";//

    public static final String MSG_INVITE_INFO_NOT_EXIST = "No corresponding invitation information";

    public static final String CODE_FRIEND_EXIST = "20103";//

    public static final String MSG_FRIEND_EXIST = "The friend already exists";

    public static final String CODE_FRIEND_NOT_EXIST = "20104";//

    public static final String MSG_FRIEND_NOT_EXIST = "The friend doesn't exist";

    public static final String CODE_INVITE_ACCEPT_REPEAT = "20105";//

    public static final String MSG_INVITE_ACCEPT_REPEAT = "Friend status error";

    public static final String CODE_GROUP_NOT_EXIST = "20106";//

    public static final String MSG_GROUP_NOT_EXIST = "The corresponding group doesn't exist";

    public static final String CODE_FRIEND_CANNOT_ADD_SELF = "20107";//

    public static final String MSG_FRIEND_CANNOT_ADD_SELF = "You cannot add yourself as friend";

    public static final String CODE_FRIEND_NOT_BELONG_USER = "20108";//

    public static final String MSG_FRIEND_NOT_BELONG_USER = "The current user and the added user are not friends";

    public static final String CODE_FRIEND_GROUP_NOT_EXISTS = "20109";//

    public static final String MSG_FRIEND_GROUP_NOT_EXISTS = "The corresponding sharing doesn't exist";

    public static final String CODE_FRIEND_GROUP_NOT_BELONG_USER = "20110";//

    public static final String MSG_FRIEND_GROUP_NOT_BELONG_USER = "The friend group doesn't belong to the current user";

    public static final String CODE_FRIEND_STATUS_IS_NOT_I = "20111";//

    public static final String MSG_FRIEND_STATUS_IS_NOT_I = "The friend is not on the to-be-verified status.";

    public static final String MSG_CAN_NOT_ACCEPT_INVITION = "Cannot accept the invitation.";

    public static final String MSG_CAN_NOT_REFUSE_INVITION = "Cannot reject the invitation.";

    public static final String CODE_ADD_FRIEND_IN_APP_ERROR = "20112";//

    public static final String MSG_ADD_FRIEND_IN_APP_ERROR = "Failed to add users of the application as friends.";

    public static final String CODE_DEV_SHARE_OWN_ERROR = "20115";//

    public static final String MSG_DEV_SHARE_OWN_ERROR = "You cannot share the device to yourself.";

    public static final String CODE_SHARE_EXISTS_ERROR = "20116";//

    public static final String MSG_SHARE_EXISTS_ERROR = "The device has been shared to the account.";

    public static final String CODE_SHARE_USER_CROSS_DOMAIN = "20117";//

    public static final String MSG_SHARE_USER_CROSS_DOMAIN = "You and the friend are not in the same area.";

    public static final String CODE_SHARE_LIMIT = "20118";//

    public static final String MSG_SHARE_LIMIT = "The sharing exceeds the limits.";

    /**************** 与好友分享相关异常 *******************/
    public static final String CODE_ALARM_UPDATE_ERROR = "20201";// 操作报警信息失败

    public static final String MSG_ALARM_UPDATE_ERROR = "Failed to handle alarm information";

    public static final String CODE_lEAVE_UPDATE_ERROR = "20202";// 操作留言信息失败

    public static final String MSG_lEAVE_UPDATE_ERROR = "Failed to handle message";

    public static final String CODE_DEVICE_TRIGGER_INFO_NOT_EXIST = "20301";// 根据uuid查询报警信息不存在

    public static final String MSG_DEVICE_TRIGGER_INFO_NOT_EXIST = "The alarm information is no found after searching via uuid";// 根据uuid查询报警信息不存在

    public static final String CODE_DEVICE_UUID_PIC_NOT_EXIST = "20302";// 根据uuid查询图片不存在

    public static final String MSG_DEVICE_UUID_PIC_NOT_EXIST = "The picture is not found after searching via uuid";// 根据uuid查询图片不存在

    public static final String CODE_DEVICE_FID_PIC_NOT_EXIST = "20303";// 根据uuid查询图片不存在

    public static final String MSG_DEVICE_FID_PIC_NOT_EXIST = "The picture is not found after searching via fid";// 根据uuid查询图片不存在

    public static final String CODE_DEVICE_IP_ERROR = "20305";// 设备解析错误

    public static String MSG_DEVICE_IP_ERROR = "Parsing device IP address error";// 设备ip解析错误

    /****************  与用户空间存储相关异常 *******************/
    public static final String CODE_CLOUD_SPACE_NOT_EXISIT = "20401";// 用户云空间信息不存在

    public static final String MSG_CLOUD_SPACE_NOT_EXISIT = "The information of cloud storage service doesn't exist";

    public static final String CODE_CLOUD_SPACE_OPERATE_FALESE = "20402";

    public static final String MSG_CLOUD_SPACE_OPERATE_FALESE = "The operation of cloud storage service failed";

    public static final String CODE_CLOUD_SPACE_MENU_NOT_EXISTS = "20403";// 用户目录不存在

    public static final String MSG_CLOUD_SPACE_MENU_NOT_EXISTS = "The directory doesn't exist";

    public static final String CODE_CLOUD_SPACE_TARGET_MENU_NOT_EXISTS = "20404";

    public static final String MSG_CLOUD_SPACE_TARGET_MENU_NOT_EXISTS = "The target directory doesn't exist";

    public static final String CODE_CLOUD_SPACE_DELETE_MENU_NOT_EXISTS = "20405";

    public static final String MSG_CLOUD_SPACE_DELETE_MENU_NOT_EXISTS = "The file information to be deleted doesn't exist";

    public static final String CODE_CLOUD_SPACE_OPEN_INFO_EXISTS = "20406";

    public static final String MSG_CODE_CLOUD_SPACE_OPEN_INFO_EXISTS = "The cloud storage service has been enabled";

    public static final String CODE_CLOUD_SPACE_OPEN_FAILED = "20407";

    public static final String MSG_CODE_CLOUD_SPACE_OPEN_FAILED = "Failed to activate cloud storage service";

    /**************** 楼宇可视对讲错误码 *******************/

    public static final String CODE_BUILDING_ERROR_DATA = "20500";

    public static final String MSG_NO_CALL = "There is no call or";

    public static final String MSG_BUILDING_ERROR_DATA = "Getting data error.";

    public static final String CODE_BUILDING_UNLOCK_FAILED = "20501";

    public static final String MSG_BUILDING_UNLOCK_FAILED = "Failed to unlock the door.";

    public static final String CODE_BUILDING_NO_CALLING = "20502";

    public static final String MSG_BUILDING_NO_CALLING = "The indoor station doesn't receive the calling.";

    public static final String CODE_BUILDING_DIALING = "20503";

    public static final String MSG_BUILDING_DIALING = "Ringing...";

    public static final String CODE_BUILDING_CALLING = "20504";

    public static final String MSG_BUILDING_CALLING = "The indoor station is on a call.";

    public static final String CODE_BUILDING_DEV_OPT_FAILED = "20505";

    public static final String MSG_BUILDING_DEV_OPT_FAILED = "Device operation failed.";

    public static final String CODE_DEV_COMMAND_ILLEGAL = "20506";

    public static final String MSG_DEV_COMMAND_ILLEGAL = "Invalid command.";

    public static final String CODE_DEV_ERR_LOCK_PASSWORD_WRONG = "20507";

    public static final String MSG_DEV_ERR_LOCK_PASSWORD_WRONG = "Smart lock password error";

    public static final String CODE_DEV_ERR_CONTROL_LOCK_FAILURE = "20508";

    public static final String MSG_DEV_ERR_CONTROL_LOCK_FAILURE = "Operation smart lock failed";

    public static final String CODE_DEV_ERR_CONTROL_LOCK_OVERTIME = "20509";

    public static final String MSG_DEV_ERR_CONTROL_LOCK_OVERTIME = "Operation smart lock times out";

    public static final String CODE_DEV_ERR_LOCK_DEVICE_BUSY = "20510";

    public static final String MSG_DEV_ERR_LOCK_DEVICE_BUSY = "Smart lock device is busy";

    public static final String CODE_DEV_ERR_UNOPEN_REMOTE_LOCK_FUNCTION = "20511";

    public static final String MSG_DEV_ERR_UNOPEN_REMOTE_LOCK_FUNCTION = "Remote operation lock is not opened";

    /**************** 楼宇可视对讲错误码 *******************/

    /**************** 兼容视频7服务错误码 *******************/

    public static final String CODE_SHARE_DUPLICATED = "7007";// 重复邀请

    public static final String MSG_SHARE_DUPLICATED = "The invitation already exists";

    /**************** 调用阿里物联平台异常 *******************/

    public static final String DEVICE_NOT_REGISTERED = "4003";// 阿里设备未注册

    // public static final String MSG_DEVICE_NOT_REGISTERED = "The device is unregistered";

    public static final String NOTIFY_DEVICEONLINESTATE_FAILED = "60011";// 调用设备在线状态通知接口失败

    public static final String GET_PIC_FAILED = "60012";// 获取图片失败

    public static final String MSG_ACCOUNT_DOES_NOT_BLANK = "The Alibaba user ID cannot be empty";

    public static final String MSG_UUID_DOES_NOT_BLANK = "uuid is null";

    public static final String MSG_FEATURE_DOES_NOT_BLANK = "Device attribute code(featureCode) cannot be empty";

    /**************** 与用户相关异常 *******************/
    public static final String USER_NOT_EXIST = "30001";// 用户不存在

    public static final String MSG_USER_NOT_EXIST = "The user doesn't exist";

    public static final String USER_PHONE_REGISTED = "30002"; // 手机号码已经注册

    public static final String MSG_USER_PHONE_ILLEGAL = "Invalid phone number";

    public static final String USER_VERIFY_CHECKCODE_EXCEPTION = "30003"; // 手机验证码错误

    public static final String MSG_USER_VERIFY_CHECKCODE_EXCEPTION = "The verification code is incorrect";

    public static final String MSG_USER_REGIST_SEND_MESSAGE_FAILD = "Failed to get verification code";

    public static final String MSG_SMSCODE_IS_NULL = "The verification code (smsCode) is empty!";

    public static final String VALIDATE_STATUS_EXCEPTION = "30004"; // 终端绑定操作失败

    public static final String MSG_VALIDATE_STATUS_EXCEPTION = "Failed to bind the terminal device. Try again.";

    /**************** 其他相关异常  *******************/
    public static final String DATA_ERROR = "49999"; // 数据异常

    public static final String MSG_DATA_ERROR = "Data error"; // 数据异常

    public static final String MSG_DEVICE_NOT_SUPPORT_OR_REPORT = "The status is not reported or not supported by the device.";

    public static final String MSG_INTERFACE_ERROR = "Calling API error";

    public static final String MSG_PRESET_ADD_ERROR = "Adding preset error";

    public static final String SERVER_ERROR = "50000"; // 服务器异常

    public static final String MSG_COULD_SERVER_ERROR = "Cloud storage calling service error";

    public static final String YS_SERVER_ERROR = "-1"; // 服务器异常

    public static final String MSG_SAVE_ERROR = "Saving failed";

    public static final String MSG_AREA_INFO_ERROR = "Getting area information error";

    public static final String MSG_SERVER_ERROR = "Server error"; // 服务器异常

    public static final String JSON_PARSE_ERROR = "50001"; // 解析JSON内容错误

    public static final String MSG_JSON_PARSE_ERROR = "JSON contents error"; // JSON内容错误

    public static final String SERVER_ERROR_WECHAT_QRCODE = "50002"; // 调用微信二维码生成服务异常

    /**************** 普通http接口设备操作相关 *******************/
    public static final String NO_SUPPORT_TO_PTZ = "60000"; // 设备不支持云台控制

    public static final String MSG_NO_SUPPORT_TO_PTZ = "The device doesn't support PTZ control";

    public static final String NO_ACCESS_TO_PTZ = "60001"; // 用户无云台控制权限

    public static final String MSG_NO_ACCESS_TO_PTZ = "The user has no PTZ control permission.";

    public static final String PTZ_ROTATION_UP_LIMIT = "60002"; // 设备云台旋转达到上限位

    public static final String MSG_PTZ_ROTATION_UP_LIMIT = "The PTZ rotation reaches the upper-limit";

    public static final String PTZ_ROTATION_DOWN_LIMIT = "60003"; // 设备云台旋转达到下限位

    public static final String MSG_PTZ_ROTATION_DOWN_LIMIT = "The PTZ rotation reaches the lower-limit";

    public static final String PTZ_ROTATION_LEFT_LIMIT = "60004"; // 设备云台旋转达到左限位

    public static final String MSG_PTZ_ROTATION_LEFT_LIMIT = "The PTZ rotation reaches the left limit";

    public static final String PTZ_ROTATION_RIGHT_LIMIT = "60005"; // 设备云台旋转达到右限位

    public static final String MSG_PTZ_ROTATION_RIGHT_LIMIT = "The PTZ rotation reaches the right limit";

    public static final String PTZ_OPERATE_FAILED = "60006"; // 云台当前操作失败

    public static final String MSG_PTZ_OPERATE_FAILED = "The current PTZ operation failed";

    public static final String PTZ_PRESET_EXCEED_MAXNUM = "60007"; // 预置点个数超过最大值

    public static final String MSG_PTZ_PRESET_EXCEED_MAXNUM = "The preset number exceeds the upper-limit";

    public static final String C6_PTZ_PRESET_NO_TO_LIMIT = "60008"; // C6预置点个数达到上限，无法添加

    public static final String MSG_C6_PTZ_PRESET_NO_TO_LIMIT = "Failed ot add preset. The preset number of C6 reaches the upper-limit";

    public static final String PTZ_CALLING_PRESET = "60009"; // 正在调用预置点

    public static final String MSG_PTZ_CALLING_PRESET = "Calling preset...";

    public static final String PTZ_PRESET_CURRENT_POSITION = "60010"; // 该预置点已经是当前位置

    public static final String MSG_PTZ_PRESET_CURRENT_POSITION = "The current position is already the preset";

    public static final String PTZ_PRESET_NOT_EXIST = "60011"; // 预置点不存在

    public static final String MSG_PTZ_PRESET_NOT_EXIST = "The preset doesn't exist";

    public static final String UNKNOWN_ERROR = "60012"; // 未知错误

    public static final String MSG_UNKNOWN_ERROR = "Unknown error";

    public static final String MSG_SET_CHIME_TYPE_FAILED = "Failed to set chime type. Device returns:";

    public static final String MSG_GET_CHIME_TYPE_FAILED = "Failed to get chime type. Device returns:";

    public static final String MSG_SET_PIR_CONFIG_FAILED = "Failed to set pir config. Device returns:";

    public static final String MSG_GET_PIR_CONFIG_FAILED = "Failed to get pir config. Device returns:";

    public static final String MSG_SET_MOTION_DETECT_CONFIG_FAILED = "Failed to set pir config. Device returns:";

    public static final String MSG_GET_MOTION_DETECT_CONFIG_FAILED = "Failed to get pir config. Device returns:";

    public static final String MSG_GET_AI_GORITHM_CONFIG_IS_NULL = "The intelligent algorithm data obtained is empty";

    public static final String MSG_GET_AI_GORITHM_CONFIG_FAILED = "Failed to get the intelligent algorithm configuration. Device returns:";

    public static final String MSG_SET_AI_GORITHM_CONFIG_FAILED = "Failed to get the intelligent algorithm configuration. Device returns:";

    public static final String MSG_SET_ALARM_SOUND_TYPE_FAILED = "Failed to set alarm sound mode. Device returns:";

    public static final String MSG_OPT_NOTIFY_SWITCH = "Failed to enable or disable device offline notification. Return:";

    public static final String MSG_DEVICE_CONTROL_FAILED = "Device operation failed. Return other error codes:";

    public static final String MSG_ADD_DELETE_DETECTOR_FAILED = "Failed to operate the detector. The device returns other error codes ";

    public static final String DEV_NOT_NEED_UPGRADE = "60013"; // 设备版本已是最新

    public static final String MSG_DEV_NOT_NEED_UPGRADE = "The device version is already the latest";

    public static final String DEV_IS_UPGRADING = "60014"; // 设备正在升级

    public static final String MSG_DEV_IS_UPGRADING = "The device is upgrading...";

    public static final String DEV_IS_REBOOTING = "60015"; // 设备正在重启

    public static final String MSG_DEV_IS_REBOOTING = "The device is rebooting...";

    public static final String DEV_IS_NOT_ENCRYPT = "60016"; // 加密未开启，无需关闭

    public static final String MSG_DEV_IS_NOT_ENCRYPT = "Encryption is already disabled";

    public static final String DEV_CAPTURE_PIC_FAILED = "60017"; // 设备抓图失败

    public static final String MSG_DEV_CAPTURE_PIC_FAILED = "Failed to capture picture";

    public static final String DEV_UPGRADE_FAILED = "60018"; // 设备升级失败

    public static final String MSG_DEV_UPGRADE_FAILED = "Device upgrading failed";

    public static final String DEV_IS_ENCRYPTED = "60019"; // 加密已开启

    public static final String MSG_DEV_IS_ENCRYPTED = "Encryption is enabled";

    public static final String DEV_IS_COMMAND_UNKNOWN = "60020"; // 不支持该命令

    public static final String MSG_DEV_IS_COMMAND_UNKNOWN = "The command is unsupported";

    public static final String MSG_DEV_IS_COMMAND_UNKNOWN_NEED_UPGRADE = "The command in device is unsupported , need upgrading device to support it";

    public static final String MSG_DEVICE_NOT_SUPPORT_ASSOCIATE_DETECTOR = "Linking to detector is not supported by the device ";

    public static final String MSG_DEVICE_NOT_SUPPORT_ASSOCIATE_IPC = "Linking to IPC is not supported by the device ";

    public static final String MSG_DEVICE_NOT_SUPPORT_DELETE_DETECTOR = "Deleting detector is not supported by the device ";

    public static final String MSG_DEVICE_NOT_SUPPORT_ADD_DETECTOR = "Deleting detector is not supported by the device ";

    public static final String MSG_DEVICE_NOT_SUPPORT_CANCEL_ALARM = "Clearing alarm remotely is not supported by the device ";

    public static final String MSG_DEVICE_NOT_SUPPORT_UPDATE_NAME = "Editing external device name (mounting location) is not supported by the device ";

    public static final String MSG_NOT_SUPPORT_SAFEMODE_SET = "Setting mode of detector [%s] of [%s] model is not supported by the device [%s]";

    public static final String MSG_DEVICE_NOT_SUPPORT_DEFENCE_SET = "Arming and disarming is not supported by the device ";

    public static final String MSG_DEVICE_CAPTURE_PIC_ERROR = "Capturing picture is not supported by the device ";

    public static final String DEV_DEFENCE_IS_CURRENT_STATUS = "60021"; // 已是当前布撤防状态

    public static final String MSG_DEV_DEFENCE_IS_CURRENT_STATUS = "Already be the current arming and disarming status";

    public static final String DETECTOR_ENABLE_IS_CURRENT_STATUS = "60022"; // 已是当前状态

    public static final String MSG_DETECTOR_ENABLE_IS_CURRENT_STATUS = "Already be the current status";

    public static final String ADD_SUBSCRIBE_FAILED = "60023"; // 已是当前状态

    public static final String MSG_ADD_SUBSCRIBE_FAILED = "Failed to subscribe";

    public static final String DEL_SUBSCRIBE_FAILED = "60024"; // 已是当前状态

    public static final String MSG_DEL_SUBSCRIBE_FAILED = "Failed to cancel subscription";

    public static final String FLOW_CONFIG_FAILED = "60025"; // 客流统计配置失败

    public static final String MSG_FLOW_CONFIG_FAILED = "People counting configuration failed";

    public static final String PTZ_PRIVACYING_FAILED = "60026"; //

    public static final String MSG_PTZ_PRIVACYING_FAILED = "The device has enabled privacy mask";

    public static final String PTZ_MIRRORING_FAILED = "60027"; //

    public static final String MSG_PTZ_MIRRORING_FAILED = "The device has enabled mirror mode";

    public static final String PTZ_CONTROLING_FAILED = "60028"; //

    public static final String MSG_PTZ_CONTROLING_FAILED = "The device is under PTZ control";

    public static final String PTZ_TTSING_FAILED = "60029"; //

    public static final String MSG_PTZ_TTSING_FAILED = "The device is under two-way audio";

    public static final String RECHARGE_CARD_LIMIT = "60030"; // 卡密输入错误次数过多，24小时后再输入

    public static final String MSG_RECHARGE_CARD_LIMIT = "Too many failed password attempts. Try again after 24 hours";

    public static final String RECHARGE_CARD_NOT_EXIST = "60031"; // 卡密信息不存在

    public static final String MSG_RECHARGE_CARD_NOT_EXIST = "The password information of the cloud storage card doesn't exist";

    public static final String RECHARGE_CARD_STATE_ERROR = "60032"; // 卡密状态不对或已过期

    public static final String MSG_RECHARGE_CARD_STATE_ERROR = "Incorrect password status or the password is expired";

    public static final String RECHARGE_CARD_BIND = "60033"; // 卡密非卖品，只能开通对应的绑定设备

    public static final String MSG_RECHARGE_CARD_BIND = "This cloud storage card is not for sale. Only the bound device can use it";

    public static final String BUY_SERVICE_FAILED = "60035"; // 购买云存储服务失败

    public final static String NVR_ADD_IPC_NOT_IN_LAN = "60040";// 添加的设备不在同一局域网

    public final static String MSG_NVR_ADD_IPC_NOT_IN_LAN = "The added device is not in the same local network";

    public final static String NVR_ADD_IPCADDED_OR_TIMEOUT = "60041";// 添加的设备被其他设备关联或响应超时

    public final static String MSG_NVR_ADD_IPCADDED_OR_TIMEOUT = "The added device is linked with other device or response timeout";//

    public final static String NVR_ADD_IPC_KEY_ERROR = "60042";// 添加的设备密码错误

    public final static String MSG_NVR_ADD_IPC_KEY_ERROR = "Incorrect password for the added device";//

    public final static String NVR_ADD_IPC_OVER_MAXNUM = "60043";// 添加的设备超出最大数量

    public final static String MSG_NVR_ADD_IPC_OVER_MAXNUM = "The added device number exceeds the upper-limit";//

    public final static String NVR_ADD_IPC_NET_TIMEOUT = "60044";// 添加的设备网络不可达超时

    public final static String MSG_NVR_ADD_IPC_NET_TIMEOUT = "Timeout. The added device's IP address is unreachable";//

    public final static String NVR_ADD_IPC_IPCONFLICT_WITH_CHANNEL = "60045";// 添加的设备的IP和其他通道的IP冲突

    public final static String MSG_NVR_ADD_IPC_IPCONFLICT_WITH_CHANNEL = "The added device's IP address is in conflict with other's";//

    public final static String NVR_ADD_IPC_IPCONFLICT_WITH_SELF = "60046";// 添加的设备的IP和本设备的IP冲突

    public final static String MSG_NVR_ADD_IPC_IPCONFLICT_WITH_SELF = "The added device's IP address is in conflict with the current device's";//

    public final static String NVR_ADD_IPC_STREAMTYPE_UNSUPPORT = "60047";// 码流类型不支持

    public final static String MSG_NVR_ADD_IPC_STREAMTYPE_UNSUPPORT = "The stream type is not supported";//

    public final static String NVR_ADD_IPC_OVERLOAD_BANDWIDTH = "60048";// 带宽超出系统接入带宽

    public final static String MSG_NVR_ADD_IPC_OVERLOAD_BANDWIDTH = "The total bandwidth exceeds the upper-limit";//

    public final static String NVR_ADD_IPC_IPPORT_INVALIED = "60049";// IP或者端口不合法

    public final static String MSG_NVR_ADD_IPC_IPPORT_INVALIED = "Invalid IP address or port number";//

    public final static String NVR_ADD_IPC_VERSION_UNSUPPORT = "60050";// 添加的设备版本不支持需要升级才能接入

    public final static String MSG_NVR_ADD_IPC_VERSION_UNSUPPORT = "Try again after upgrading the device. The current version of the added device is not supported";//

    public final static String NVR_ADD_IPC_FUNC_UNSUPPORT = "60051";// 添加的设备不支持接入

    public final static String MSG_NVR_ADD_IPC_FUNC_UNSUPPORT = "The added device doesn't support EZVIZ service";//

    public final static String NVR_ADD_IPC_CHANNEL_ERROR = "60052";// 添加的设备通道号出错

    public final static String MSG_NVR_ADD_IPC_CHANNEL_ERROR = "The channel number of the added device is incorrect";//

    public final static String NVR_ADD_IPC_RESOLUTION_UNSUPPORT = "60053";// 添加的设备分辨率不支持

    public final static String MSG_NVR_ADD_IPC_RESOLUTION_UNSUPPORT = "The resolution of the added device is not supported";//

    public final static String NVR_ADD_IPC_ACCOUNT_LOCKED = "60054";// 添加的设备账号被锁定

    public final static String MSG_NVR_ADD_IPC_ACCOUNT_LOCKED = "The account of the added device is frozen";//

    public final static String NVR_ADD_IPC_STREAM_ERROR = "60055";// 添加的设备取码流出错

    public final static String MSG_NVR_ADD_IPC_STREAM_ERROR = "The added device getting stream error";//

    public final static String NVR_DEL_IPC_FAILED = "60056";// 删除设备失败

    public final static String MSG_NVR_DEL_IPC_FAILED = "Failed to delete the device";//

    public final static String NVR_DEL_IPC_UNASSOCIATE = "60057";// 删除的设备未关联

    public final static String MSG_NVR_DEL_IPC_UNASSOCIATE = "The IPC to be deleted is not linked to the NVR";//
    public final static String ADDRESS_NOT_USE = "60059";
    public final static String MSG_ADDRESS_NOT_USE = "ezopen地址均不可用";

    public final static String ADDRESS_NOT_BOUND = "60060";

    public final static String MSG_ADDRESS_NOT_BOUND = "The address is unbound";

    public final static String LIVE_ADDRESS_LIMITED = "60061";

    public final static String MSG_LIVE_ADDRESS_LIMITED = "Failed to enable the live view function of the channel. The account traffic is in excess or hasn't been purchased";

    public final static String LIVE_ADDRESS_OPENED = "60062";

    public final static String MSG_LIVE_ADDRESS_OPENED = "The live view function of the channel is enabled";

    public final static String CANNOT_TRANSFER_TO_YOURSELF = "60070";

    public final static String MSG_CANNOT_TRANSFER_TO_YOURSELF = "You cannot transfer the device to yourself";

    public final static String CANNOT_TRANSFER_DEV_RELATED = "60071";

    public final static String MSG_CANNOT_TRANSFER_DEV_RELATED_1 = "The device cannot be transferred. The device is linked to NVR or IPC";

    public final static String MSG_CANNOT_TRANSFER_DEV_RELATED_2 = "The device cannot be transferred. The device is linked to A1 device or IPC";

    public final static String CANNOT_TRANSFER_IPC_SHARED = "60072";

    public final static String MSG_CANNOT_TRANSFER_IPC_SHARED = "The device cannot be transferred. The channel is shared with other accounts or shared to the Gallery";

    public final static String CANNOT_TRANSFER_CLOUD_STROAGE_FAILED = "60073";

    public final static String MSG_CANNOT_TRANSFER_CLOUD_STROAGE_FAILED = "Failed to transfer the cloud storage service";

    public static final String USER_CANNOT_DIFFERENT_REGION = "60074";

    public static final String MSG_USER_CANNOT_DIFFERENT_REGION = "transfer User cannot different region";

    public static final String IMAGE_DOWNLOAD_FAIL = "60101";

    public static final String MSG_IMAGE_DOWNLOAD_FAIL = "Failed to parse picture";

    public static final String IMAGE_DATA_SIZE_LIMITED = "60102";

    public static final String MSG_IMAGE_DATA_SIZE_LIMITED = "The picture size exceeds the specified value";

    public static final String OTHER_ERROR = "60103";

    public static final String MSG_OTHER_ERROR = "Other errors";

    public static final String TIME_OUT = "60104";

    public static final String MSG_TIME_OUT = "Timeout";

    public static final String CLOUD_FAILED = "60105";

    public static final String MSG_CLOUD_FAILED = "Failed";

    public static final String CLOUD_NULL = "60106";

    public static final String MSG_CLOUD_NULL = "The result is null";

    public static final String CLOUD_NOT_SUPPORT = "60107";

    public static final String MSG_CLOUD_NOT_SUPPORT = "Error. Not supported";

    public static final String URL_ILLEGAL = "60108";

    public static final String MSG_URL_ILLEGAL = "Invalid URL";

    public static final String MSG_BUY_SERVICE_FAILED = "Failed to purchase cloud storage service";

    public static final String OPENAPI_USER_BASICINFO = "OPENAPI_USER_BASICINFO";

    /**************** 调用酷派大家平台异常 *******************/
    public static final String CODE_COOLPAD_TOKEN_VALIDATE_ERROR = "70001";

    /**************** 第三方合作伙伴调用异常 *******************/
    public static final String CODE_NO_AUTHORITY_DEVICE_INFO = "70001";

    public static final String MSG_NO_AUTHORITY_DEVICE_INFO = "No permission to get the device information";

    public static final String CODE_THIRD_TOKEN_NOT_BLANK = "70002";

    public static final String MSG_THIRD_TOKEN_NOT_BLANK = "The third party token cannot be null";


    /******************************************** 资源组相关信息 **********************************************************/

    public static final String RESOURCE_GROUP_NOT_EXIST = "70002";

    public static final String MSG_RESOURCE_GROUP_NOT_EXIST = "Group doesn't belong to the EZVIZ user."; //资源组不存在

    public static final String MSG_RESOURCE_GROUP_ID_IS_NULL = "GroupId cannot be null"; // 资源组ID为NULL

    public static final String MSG_RESOURCE_GROUP_CONTACT_IS_NULL = "Contact cannot be null"; // 联系方式为NULL

    public static final String MSG_RESOURCE_GROUP_PUSH_CONTENT_IS_NULL = "pushContent cannot be null"; // 联系方式为NULL

    public static final String MSG_RESOURCE_GROUP_DES_IS_NULL = "GroupDes cannot be null"; // 资源组描述为NULL

    public static final String MSG_RESOURCE_GROUP_NAME_IS_NULL = "GroupName cannot be null"; // 资源组名称为NULL

    public static final String MSG_RESOURCE_GROUP_SOURCE_IS_NULL = "GroupSource cannot be null"; // 资源组来源为NULL

    public static final String MSG_AUTHORIZED_IS_NULL = "authorizeId cannot be null"; // 资源组来源为NULL

    public static final String MSG_AUTHORIZEDINFO_ERROR = "authorizeInfo error,please check!!"; // 资源组来源为NULL

    public static final String RESOURCE_GROUP_CAMERA_EXIST = "70003";

    public static final String MSG_RESOURCE_GROUP_CAMERA_EXIST = "Group Camera is exist."; // 资源组该通道已存在

    public static final String RESOURCE_GROUP_CAMERA_NOT_EXIST = "70004";

    public static final String MSG_RESOURCE_GROUP_CAMERA_NOT_EXIST = "Group Camera is not exist."; // 资源组该通道已存在


    public static final String SESSIONID_IS_NULL = "70005";

    public static final String MSG_SESSIONID_IS_NULL = "SESSIONID_IS_NULL.";

    public static final String MSG_SESSIONID_ERROR = "sessionId is not exist.";// 资源组该通道已存在


    public static final String MSG_PUSH_CONTENT_INVALID = "Invalid pushContent";

    public static final String MSG_AUTHRIZEINFO_INVALID = "Invalid authorizeInfo";


    public static final String APPKEY_NOT_RIGHT = "70006";

    public static final String NSG_APPKEY_NOT_RIGHT = "TRUST USER IS NOT RIGHT";

    public static final String USER_EXIST = "70007";
    public static final String MSG_USER_EXIST = "USER IS EXIST";

    public static final String Message_expiration = "70010";

    public static final String MSG_Message_expiration = "Message expiration";
    public static final String MESSAGRE_NOT_EXIST = "70011";

    public static final String MSG_MESSAGRE_NOT_EXIST = "Message not exist";


    /**************** 获取iframe播放地址异常 *******************/
    public static final String CODE_IFRAME_URL_EXPIRE = "40001";

    public static final String MSG_IFRAME_URL_EXPIRE = "URL expired";

    /**************** 与分页相关 *******************/
    // 分页开始最小值
    public static final int PAGE_START_L = 0;

    public static final String MSG_PAGESTART_IS_NULL = "The start page(pageStart) is null";

    public static final String MSG_PAGESTART_ERROR = "The start page(pageStart) format error!";

    public static final String MSG_PAGESTART_MAX_ERROR = "The start page(pageStart) cannot more than 2147483647！";
    // 分页大小最小值
    public static final int PAGE_SIZE_L = 1;

    public static final String MSG_PAGESIZE_IS_NULL = "Page size (pageSize) is null";

    public static final String MSG_PAGESIZE_ERROR = "Page size (pageSize) format error";

    public static final String MSG_PAGESIZE_MAX_ERROR = "Page size (pageSize) cannot more than 2147483647！";
    // 分页大小最大值，目前暂定每页最多返回50条数据
    public static final int PAGE_SIZE_H = 50;

    /*******************/
    public static final String OPENAPI_ACCESS_TOKEN = "OPENAPI_ACCESS_TOKEN_";

    // public static final String OPENAPI_USER_INFO = "OPENAPI_USER_INFO";// 废弃

    public static final String OPENAPI_APP_INFO = "OPENAPI_APP_INFO";
    public static final String OPENAPI_USER_APP = "OPENAPI_USER_APP";

    public static final String OPENAPI_MICRO_SERVICE_INFO = "OPENAPI_MICRO_SERVICE_INFO";

    public static final String OPENAPI_CAM_AD = "OPENAPI_CAM_AD";

    public static final String OPENAPI_APP_IP = "OPENAPI_APP_IP";

    public static final String OPENAPI_NAME_CALL_TIMES = "OPENAPI_NAME_CALL_TIMES";

    public static final String OPENAPI_NAME_CALL_TIMES_SETTINGS = "OPENAPI_NAME_CALL_TIMES_SETTINGS";

    public static final String OPENAPI_NAME_CALL_BLACK = "OPENAPI_NAME_CALL_BLACK";

    public static final String OPEN_APP_INFO = "OPEN_APP_INFO";

    public static final String OPEN_URL_FILTER_APPKEY = "OPEN_URL_FILTER_APPKEY";

    public static final String OPEN_BLACK_LIST_FILTER_APPKEY = "OPEN_BLACK_LIST_FILTER_APPKEY";

    public static final String OPEN_ADD_PAGE_STYLE = "OPEN_ADD_PAGE_STYLE";

    public static final String OPEN_REGIST_FILTER = "OPEN_REGIST_FILTER";

    public static final String OPEN_A100_KAFKA_ALARM_SERVICE = "OPEN_A100_KAFKA_ALARM_SERVICE_";

    public static final String OPEN_A100_KAFKA_OTHER_SERVICE = "OPEN_A100_KAFKA_OTHER_SERVICE_";

    public static final String OPEN_FEATURE_CODE_FILTER = "OPEN_FEATURE_CODE_FILTER";

    public static final String LEAVEMESSAGE_CLOUD_STRATEGY = "OPEN_LEAVEMESSAGE_CLOUD_STRATEGY"; // 留言云存储策略

    public static final String OPENAPI_SDK_METHOD_WHITE_LIST = "OPENAPI_SDK_METHOD_WHITE_LIST"; // SDK方法白名单列表

    public static final String OPENAPI_HTTP_METHOD_WHITE_LIST = "OPENAPI_HTTP_METHOD_WHITE_LIST"; // HTTP方法白名单列表

    public static final String OPENAPI_CALL_TIMES_WHITE_LIST = "OPENAPI_CALL_TIMES_WHITE_LIST"; // 调用次数白名单列表

    public static final String OPENAPI_APP_VERSION = "OPENAPI_APP_VERSION#"; // 调用次数白名单列表

    public static final String LIVEADDRESS = "LIVE_ADDRESS#";
    /*
     * 用户登录过期时间
     */

    public static final int SESSION_SURVIVAL = 24 * 60 * 60;

    public static final int SESSION_WEB_SURVIVAL = 30 * 60;

    public static final int ONE_MIN_CACHE = 60;

    public static final String UNDERLINE_SIGN = "_";

    // 参数分隔符
    public static final String PARAMETER_SPLITER = ";";

    public static final String TIME_ENABLED = "0";// 不启用时间限制

    public static final String DEVICE_ONLINE = "1";// 不启用时间限制

    public static final String DEVICE_NOTONLINE = "2";// 不启用时间限制

    /***************************************** 短信类型  **************************************************************/

    public static final String SMS_OPENYSSERVICE = "[open Ezviz service] Verification code:";// 开通萤石云服务

    public static final String SMS_SECUREVILIDATE = "[security validation] Verification code:";// 萤石云安全验证服务

    public static final String SMS_SHARE_SQUARE = "[ video sharing] Verification code:";// 分享萤石视频

    public static final String SMS_REGIST = "[account registration] Verification code: ";// 用户注册

    public static final String SMS_RESET_PASS = "[reset password]Verification code:";// 重置密码

    public static final String SMS_DEV_OP = "[authentication] Verification code:";// 设备操作

    public static final String CHECK_CODE_PREFIX = ",expires in 30 minutes.";// "，有效时间为30分钟。\r\n安全提示：请勿向任何人泄露您的验证码。"

    /******************************************** 透明通道 **********************************************************/
    public static final String OPEN_PLATFORM_APP_CACHE = "OPEN_PLATFORM_APP_CACHE_";

    public static final String TRANSPARENT_AUTH_TICKET = "TRANSPARENT_AUTH_TICKET";

    public static final String OPEN_PLATFORM_TRANSPARENT_AUTH = "OPEN_PLATFORM_TRANSPARENT_AUTH_";

    public static final String TRANSPARENT_TO_YUN_FORBIDEN = "TRANSPARENT_TO_YUN_FORBIDEN_"; // APPKey是否被停止使用通明通道

    public static final String TRANSPARENT_TO_YUN_PARSE_COUNT = "TRANSPARENT_TO_YUN_PARSE_COUNT_"; // APPKey30分钟内返回不符合规范次数

    public static final String TRANSPARENT_TO_YUN_STOP = "TRANSPARENT_TO_YUN_STOP_"; // APPKey是否被暂停使用通明通道

    public static final String TRANSPARENT_TO_YUN_FAIL_COUNT = "TRANSPARENT_TO_YUN_FAIL_COUNT_"; // APPKey30分钟内callback失败次数

    public static final String TRANSPARENT_TO_YUN_FAIL_TIME = "TRANSPARENT_TO_YUN_FAIL_TIME_"; // APPKey被暂停使用透明通道的开始时间

    /**
     * 视频质量key
     **/
    public static final String VIDEO_QUALITY_CACHE = "OPENAPI_VQ_CACHE#";

    public static final int OPEN_TRANSPARENT_FORBDEN = -4;

    public static final String MSG_OPEN_TRANSPARENT_FORBDEN = "TransparentForbiden";

    public static final int OPEN_TRANSPARENT_STOP = -3;

    public static final String MSG_OPEN_TRANSPARENT_STOP = "TransparentStop";

    public static final int OPEN_TRANSPARENT_PARSE_FAIL = -2;

    public static final String MSG_OPEN_TRANSPARENT_PARSE_FAIL = "TransparentParseFail";

    public static final int OPEN_TRANSPARENT_CALLBACK_ERROR = -1;

    public static final String MSG_OPEN_TRANSPARENT_CALLBACK_ERROR = "TransparentCallbackFail";

    public static final String MSG_OPEN_TRANSPARENT_PUSH_SUCCESS = "TransparentPushSuccess";

    public static final String SMS_DEVICEOPERATE = "You are operate the device. Verification code:";// 萤石云视频加密关闭服务

    public static final String NO_SUPPORT_VALUE = "0";

    /******************************************** 留言相关 **********************************************************/
    public static final int LEAVE_MESSAGE_VOICE = 1;

    public static final int LEAVE_MESSAGE_VIDEO = 2;

    public static final int LEAVE_MESSAGE_VOICE_REPLY = 3;

    public static final int LEAVE_MESSAGE_VIDEO_REPLY = 4;

    /******************************************** 操作设备返回 **********************************/
    public static final String DEV_PTZ_ROTATION_UP_LIMIT = "1310735"; // 设备云台旋转达到上限位

    public static final String DEV_PTZ_ROTATION_DOWN_LIMIT = "1310736"; // 设备云台旋转达到下限位

    public static final String DEV_PTZ_ROTATION_LEFT_LIMIT = "1310737"; // 设备云台旋转达到左限位

    public static final String DEV_PTZ_ROTATION_RIGHT_LIMIT = "1310738"; // 设备云台旋转达到右限位

    public static final String DEV_PTZ_OPERATE_FAILED = "1310729"; // 云台当前操作失败

    public static final String DEV_PTZ_PRESET_EXCEED_MAXNUM = "1310730"; // 预置点个数超过最大值

    public static final String DEV_PTZ_CALLING_PRESET = "1310720"; // 正在调用预置点

    public static final String DEV_GENERAL_PARSE_FAILED = "1310723"; // 报文解析错误

    public static final String DEV_PTZ_PRESET_CURRENT_POSITION = "1310724"; // 该预置点已经是当前位置

    public static final String DEV_COMMAND_UNKNOWN = "129"; // 该命令不支持

    public static final String DEV_UNKNOWN_ERROR = "-1"; // 未知错误

    public static final String DEV_UNKNOWN_ERROR_2 = "1"; // 未知错误

    public static final String DEV_PTZ_PRIVACYING_FAILED = "1310731";

    public static final String DEV_PTZ_MIRRORING_FAILED = "1310732";

    public static final String DEV_PTZ_CONTROLING_FAILED = "1310733";

    public static final String DEV_PTZ_TTSING_FAILED = "1310734";

    public static final String DEV_CAPTURE_FAILED = "1052679";//设备抓图失败

    public static final String COMMA_SPLITTER = ",";

    public static final String HIGH_QUALITY = "1";

    public static final String LOW_QUALITY = "0";

    public static final String VALIDATE_CODE = "ABCDEF";


    /****************************** 业务监控项**********************/

    public static final String OPENAPI_NOT_CATCH_EXCEPTION = "openapi_not_catch_exception_error";

    public static final String OPENAPI_B_GET_TOKEN_IS_NULL = "openapi_token_is_null_error";

    public static final String OPENAPI_GET_TOKEN_INFO_NULL = "openapi_get_token_info_error";

    public static final String OPENAPI_GET_USER_TOKEN_EXCEPTION = "openapi_get_user_token_exception_error";

    /**********************分享DDNS信息接口返回错误码***************************/
    public static final String DEVICE_NOT_EXISTS = "2000"; // 设备不存在
    public static final String DEVICE_DOMAIN_USED = "2025"; // 设备域名重复
    public static final String SHARE_EXISTS = "20001"; // 分享已存在
    public static final String SHARE_USER_NOT_EXISTS = "20002"; // 好友不存在
    public static final String SHARE_CANNOT_ADD_SELF = "20003"; // 不能添加自己为好友
    public static final String SHARE_USER_CROSS_DOMAIN = "20004"; // 好友跨区域
    public static final String SHARE_NOT_EXISTS = "20005"; // 分享不存在
    public static final String SHARE_LIMIT = "20006"; // 分享超过限制
    public static final String DDNS_SERVER_ERROR = "-1"; // 服务器异常（数据库异常、由于服务器异常操作失败等）
    public static final String DDNS_INVALID_PARAM = "-6";// 参数错误
    /**********************分享DDNS信息接口返回错误码***************************/

    /******************************* 权限相关 *****************************************/

    public static final String REAL = "Live View";

    public static final String REPLAY = "Playback";

    public static final String ALARM = "Alarm";

    public static final String TALK = "Two-Way Audio";

    public static final String PTZ = "PTZ";

    /******************************* 权限相关 *****************************************/

    /************************************** 消息相关 *************************************************/

    public static final String MSG_SIGNSTRING_IS_NULL = "signString is null";

    public static final String MSG_SIGN_STRING_ILLEGAL = "Invalid signString";

    public static final String MSG_KEY_ILLEGAL = "Invalid key";

    /************************************** 消息相关 *************************************************/
    public static final String MSG_VIDEO_LEVEL_SET_FAILED = "Failed to change video resolution(videoLevel)";

    /**************************************Enum相关*************************************************/

    public static final String OPENDETECTORTYPE_ENUM_V = "Video Device";

    public static final String OPENDETECTORTYPE_ENUM_I = "Alarm-in Device";

    public static final String OPENDETECTORTYPE_ENUM_O = "Alarm-out Device";

    public static final String OPENDETECTORTYPE_ENUM_KEYBOARD = "Keyboard";

    public static final String OPENDETECTORTYPE_ENUM_FIRE = "Smoke Detector";

    public static final String OPENDETECTORTYPE_ENUM_CALLHELP = "Emergency Button";

    public static final String OPENDETECTORTYPE_ENUM_MAGNETOMETER = "Magnetic Contact";

    public static final String OPENDETECTORTYPE_ENUM_PIR = "IR Detector";

    public static final String OPENDETECTORTYPE_ENUM_CURTAIN = "Curtain";

    public static final String OPENDETECTORTYPE_ENUM_TELECONTROL = "Remote Control";

    public static final String OPENDETECTORTYPE_ENUM_MOVE_MAGNETOMETER = "Open-close Detector";

    public static final String OPENDETECTORTYPE_ENUM_ALERTOR = "Alarm Device";

    public static final String OPENDETECTORTYPE_ENUM_GAS = "Combustible Gas";

    public static final String OPENDETECTORTYPE_ENUM_WATERLOGGING = "Water Leak";

    public static final String STORAGETYPENAME_ENMU_LOCAL_STROAGE = "Local Storage";

    public static final String STORAGETYPENAME_ENMU_NAS_STROAGE = "NAS Storage";


    /**************************************Enum相关*************************************************/

}
