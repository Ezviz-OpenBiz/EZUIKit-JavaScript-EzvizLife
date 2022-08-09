# UIKit Javascript Access Control (Overseas)
## Brief Introdution
UIKit, a UI component packaged based on the EZVIZ open platform (Opensdk), there is no need to acknowledge some specific concepts first but also calling some complicated interfaces while using it, it provides a very simple way to plug in and integrate the video functions in your application quickly.


Download Address

## Browser Support

- Chrome 55+
- Firefox 55+



## How to


#### Set up：
1. Download UIKit JavaScript
2. Unzip on the server
3. Develop pages following the demo
4. Run the server

###### Note: All the dependency files should be placed on the server, as this version doesn’t support calling CDN. Additionally, the extension name of ‘iit’ should support [application/wasm]，or an error will be reported [failed to load wasm binary file at 'Decoder.wasm].

![Add mine](../img/mine.png)

## Mode distinguish
  Live-view mode：The video of the camera is transmitted to the user in real time and can be played without verification.

  Monitoring mode：After verification, users can further experience low latency and support playback of monitored video playback.。

  Multi-window mode：On the basis of monitoring mode, multiple video images can be viewed at the same time, supporting 1,4,9 window playback.

###### Note: The standard protocol used in the live broadcast mode has obvious advantages. It can be played without verification. It is simple to use and easy to spread, but the relative cost is also high. It is recommended to use it with the monitoring mode. You can refer to the light application demo for actual test.

# Live-view mode   

## Opening soon  

# Monitoring mode  

## Brief Introdution  

A milestone breakthrough: the Ezopen protocol can be played in the mainstream browser without plug-ins to achieve a 1s low latency effect, support live view, encrypted devices and H.265! (1080P is recommended as it lower the pressure of the browsers. Recommended devices can be found at product pages)

The monitoring address can be obtained from interface: Please turn to HTTP interface

## Monitoring address：
#### Address structure (adaptive address fits live view as well)：
    live-view：ezopen:// [verification code]@[area]open.ezviz.com[deviceSerial]/[channelNo] [.hd].live
	Address exemple：ezopen://isgpopen.ezviz.com/203751922/1.hd.live
	playback：ezopen:// [verification code]@open.ezviz.com/[deviceSerial]/[channelNo] [.hd].rec[?begin= yyyyMMddhhmmss&end= yyyyMMddhhmmss]
	Address example：ezopen://isgpopen.ezviz.com/203751922/1.rec?begin=20190317000000&begin=20190317235959

When the playback address does not have the time parameter, the default value is 0:00:00 to 23:59:59. The default will also be automatically supplemented. For example, “begin=2019031709” ， system will automatically add to “begin=20190317090000&end=20190317235959”

Whether there is video recording at the playback time point can be verified by calling the interface (link) of obtained storage file information according to time.

###### Note: If the device is encrypted, you need to attach a verification code to the address before playing. If not, you can also attach a verification code. The program will choose whether to use or not based on the returning stream from the device.

## Code Example——demo-monitor.html
```Javascript
//Import js first
  <script src="../ezuikit.js"></script>
  <script src="../js/jquery.min.js"></script>
//creat div tag
  <div id="myPlayer"></div>
//initializing the monitoring address
var player = new EZUIPlayer({
      id: 'myPlayer',
      url: url,
      autoplay: true,
      accessToken: "at.8o2k6dbpcvtr13reaa96hbnya6fee2wf-9gu6zcjmh2-1j4yrsb-imvlc5poc",
      decoderPath: '{location path}',
      width: 600,
      height: 400,
      env:{
      	domain: "https://isgpopen.ezvizlife.com"
      }
    });

```
## Method

  - Start Play

    `player.play()`
  - Stop Play

    `player.stop()`
  - Open Sound

    `player.openSound()`
  - Close Sound

    `player.openSound()` 


    See the demo/demo-monitor.html for more details
## Configuration Introduction
|Items|Example|Default value|Instrument|
|:---|:---:|:---|:---|
|id|myPlayer|null|*required, element tag id|
|url|ezopen://[area]open.ezviz.com/203751922/1.live|null|monitoring address|
|accessToken|"at.8o2k6dbpcvtr13reaa96hbnya6fee2wf-9gu6zcjmh2-1j4yrsb-imvlc5poc"|null|AccessToken obtained from the official website or corresponding interface|
|decoderPath|Route of decoder ezuikit.js|null|*required， live view need to load the local decoder, please fill in the corresponding path of ezuikit.|
|autoplay|true|true|Whether automatically play|
|width|400|null|Video element width|
|height|400|null|Video element height|
|splitBasis|1|1|Multi window setting window dividend parameters|
|handleError|null|null|Error callback method to catch errors|



## Configuration Introduction
As monitoring addresses have relatively high requirements for the browser’s
performance, multi-window playing will easily reach the bottleneck of the browser’s capability. Following is the test results for reference:
![监控性能](../img/Browser_capability.png)
# Security anti-theft
The surveillance address scenario requires authentication, so the user needs to enter the AccessToken. The access token of the developer account is too large and can be intercepted for illegal use. For the time of internal testing, we will temporarily experience the video capabilities. We will launch a new interface to prevent this risk , Please pay attention to the official website announcement.

**FAQ:**
###### 1.	Picture buffering under monitoring mode?
**Answer：**As the new technology has a higher requirement to the browser’s capability, higher resolution will consumes higher CPU resources, leading to picture buffering. Hence, we recommend to use 1080P and below.
###### 2.	Run webs.exe locally following the introduction, but failed to open  http://localhost/index.html?
**Answer：**Please check whether 80 port is occupied as webs.ese using 80 port at present. Port conflict will lead to failure of service running, if so, you need to shut down 80 port first and then run webs.exe.
###### 3.	 Monitoring address playback error, failed to find the playback videos?
**Answer：**Playback is to take the saved video files from the device to play. At present, there are three ways to storage the videos, (1) local SD card; (2) related NVR; (3) upload to cloud; failing to search the videos means there is no video in this time period.
