/**
 * timeline
 * version v0.0.1
 */
(function (global, factory) {
  "use strict";

  if (typeof module === "object" && typeof module.exports === "object") {
    module.exports = global.document ? factory(global, true) : function (w) {
      if (!w.document) {
        throw new Error("deviceControls requires a window with a document");
      }
      return factory(w);
    };
  } else {
    factory(global);
  } // Pass this if window is not defined yet

})(typeof window !== "undefined" ? window : void 0, function (window, noGlobal) {
  function toggleVale (value){
    return value === 0 ? 1 : 0;
  }
  var ICON = {
    playStatus: {
      status0: 'https://resource.ys7cloud.com/group2/M00/00/31/CtwQF1-RdMeAbA-MAAAGFho6Y9A361.png',
      status1: 'https://resource.ys7cloud.com/group2/M00/00/31/CtwQFl-RdM-AZDFDAAAB5H0FqNI467.png'
    },
    voiceStatus: {
      status0: 'https://resource.ys7cloud.com/group2/M00/00/31/CtwQF1-RdKGARfpXAAACwJ0WD9E016.png',
      status1: 'https://resource.ys7cloud.com/group2/M00/00/31/CtwQFl-RdMGAYZrhAAAFvMxBRWg731.png',
    },
    hdStatus: {
      status0: 'https://resource.ys7cloud.com/group2/M00/00/55/CtwQFl_pw42Ab07MAAACq0PaueM083.png',
      status1: 'https://resource.ys7cloud.com/group2/M00/00/55/CtwQF1_pw4CAYWW0AAACJEag6nU955.png'
    },
    fullScreenStatus:{
      status0: 'https://resource.ys7cloud.com/group2/M00/00/31/CtwQFl-RdKqAI3aHAAACvJQIZNI329.png',
      status1: 'https://resource.ys7cloud.com/group2/M00/00/31/CtwQFl-RdKqAI3aHAAACvJQIZNI329.png'
    }
  }

  var VideoControls = function VideoControls(params) {
    var _this = this;
    this.state = {
      id: 'video-controls',
      playStatus: 0,
      voiceStatus: 0,
      hdStatus: params.hd || 0,
      fullScreenStatus: 0,
      setPlayStatusCallBack: params.setPlayStatusCallBack,
      setVoiceStatusCallBack: params.setVoiceStatusCallBack,
      setHdStatusCallBack: params.setHdStatusCallBack,
      setFullScreenStatusCallBack: params.setFullScreenStatusCallBack,
      controls: params.controls,
      disabled: false,
    }
    this.setState = function (obj) {
      Object.keys(obj).forEach(function (key) {
        _this.state[key] = obj[key];
        switch(key){
          case 'playStatus':
          break;
          case 'voiceStatus':
          break;
          case 'hdStatus':
          break;
          case 'fullScreenStatus':
          break;
        }
      });
    }
    this.renderDOM = function (){
      const { setPlayStatusCallBack,setVoiceStatusCallBack,setHdStatusCallBack,setFullScreenStatusCallBack,disabled } = this.state;
      var container = document.getElementById(params.id);
      ['playStatus','voiceStatus','hdStatus','fullScreenStatus'].forEach(function(item,index){
        if( _this.state.controls.indexOf(item.replace('Status','')) !== -1 ) {
          var imgDom = document.createElement('img')
          imgDom.id = item;
          imgDom.src = _this.state[item] == 1 ? ICON[item].status1 : ICON[item].status0;
          container.appendChild(imgDom)
        }
      })
      if( document.getElementById("playStatus")) {
        document.getElementById("playStatus").onclick = () => {
          const { playStatus,disabled } = this.state;
          if(disabled){
            return false;
          }
          this.setPlayStatus(toggleVale(playStatus));
          typeof setPlayStatusCallBack === 'function' && setPlayStatusCallBack(toggleVale(playStatus));
        }
      }
      if( document.getElementById("voiceStatus")) {
        document.getElementById("voiceStatus").onclick = () => {
          const { voiceStatus, disabled, playStatus } = this.state;
          if(disabled || (playStatus === 0)){
            return false;
          }
          this.setVoiceStatus(toggleVale(voiceStatus));
          typeof setVoiceStatusCallBack === 'function' && setVoiceStatusCallBack(toggleVale(voiceStatus));
        }
      }
      if( document.getElementById("hdStatus")){
        document.getElementById("hdStatus").onclick = () => {
          const { hdStatus, disabled, playStatus } = this.state;
          if(disabled || (playStatus === 0)){
            return false;
          }
          this.setHdStatus(toggleVale(hdStatus));
          typeof setHdStatusCallBack === 'function' && setHdStatusCallBack(toggleVale(hdStatus));
        }
      }
      if( document.getElementById("fullScreenStatus")){
        document.getElementById("fullScreenStatus").onclick = () => {
          const { fullScreenStatus,disabled, playStatus } = this.state;
          if(disabled || (playStatus === 0)){
            return false;
          }
          this.setFullScreenStatus(toggleVale(fullScreenStatus));
          typeof setFullScreenStatusCallBack === 'function' && setFullScreenStatusCallBack(toggleVale(fullScreenStatus));
        }
      }
    }
    this.renderDOM();

  }
  VideoControls.prototype.setPlayStatus = function (value) {
    const { setPlayStatusCallBack,setVoiceStatusCallBack,setHdStatusCallBack,setFullScreenStatusCallBack } = this.state;
    this.setState({
      playStatus: value,
    });
    document.getElementById("playStatus").src  = value === 0 ? ICON.playStatus.status0: ICON.playStatus.status1;
   // typeof setPlayStatusCallBack === 'function' &&  setPlayStatusCallBack(value);
  }
  VideoControls.prototype.setVoiceStatus = function (value) {
    const { setPlayStatusCallBack,setVoiceStatusCallBack,setHdStatusCallBack,setFullScreenStatusCallBack } = this.state;
    this.setState({
      voiceStatus: value,
    });
    document.getElementById("voiceStatus").src  = value === 0 ? ICON.voiceStatus.status0 : ICON.voiceStatus.status1;
   // typeof setVoiceStatusCallBack === 'function' && setVoiceStatusCallBack(value);
  }
  VideoControls.prototype.setHdStatus = function (value) {
    const { setPlayStatusCallBack,setVoiceStatusCallBack,setHdStatusCallBack,setFullScreenStatusCallBack } = this.state;
    this.setState({
      hdStatus: value,
    });
    document.getElementById("hdStatus").src  = value === 0 ? ICON.hdStatus.status0: ICON.hdStatus.status1;
    console.log("setHdStatusCallBack",setHdStatusCallBack)
   // typeof setHdStatusCallBack === 'function' && setHdStatusCallBack(value);
  }
  VideoControls.prototype.setFullScreenStatus = function (value) {
    const { setPlayStatusCallBack,setVoiceStatusCallBack,setHdStatusCallBack,setFullScreenStatusCallBack } = this.state;
    this.setState({
      fullScreenStatus: value,
    });
  }
  VideoControls.prototype.switchDisabled = function (value) {
    this.setState({
      disabled: value,
    })
  }
  window.VideoControls = VideoControls;
})