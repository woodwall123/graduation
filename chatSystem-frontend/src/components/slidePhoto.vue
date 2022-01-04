<template>
  <div>
    <div class="slidePhoto">
      <div class="photo">
        <transition-group tag="ul" name="image">
          <li v-for="item in List" v-show="item.id === mark" :key="item.id">
            <a href="#">
              <img :src="item.image" />
            </a>
          </li>
        </transition-group>
      </div>
      <div class="bar">
        <span
          v-for="item in notice"
          :class="{ active: item.noticeId == mark }"
          :key="item.noticeId"
        ></span>
      </div>
      <div class="photoText">
        <label class="date" for=""> 24/Dec.2021 </label>
        <label for="">拯救周末计划 |</label>
        <label for="">正文：你是否想要体验云南景色</label>
      </div>
      <div class="search">
       <input type="text" placeholder="Search" id="search-input" />
       <input type="button" value="搜索" id="search-button" />
      <!-- <div class="search-iconfont"><span class="iconfont"></span></div> -->
    </div>
    </div>
    <div class="homePageBody">
        <div class="responsive">
          <div id="markLabel">
          景点介绍
        </div>
          <div class="img">
              <img
                src="//static.runoob.com/images/demo/demo2.jpg"
              />
            <div class="desc">这里添加图片文本描述</div>
          </div>
        </div>
      <div class="talkList">
        <div id="markLabel">
          精彩游记
        </div>
        <div class="talkTag">
          <div v-for="item in list" :key="item.userId">
            <div class="talkbox" @click="activeLink($event)">
              <div class="talkcircle">
                <img class="img" :src="item.userImg" />
              </div>
              <label class="userName">{{ item.userName }}</label>
              <label class="talkInfo">{{ item.talkInfo }}</label>
              <label class="talkTime">{{ item.talkTime }}</label>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data () {
    return {
      mark: 0,
      notice: [],
      List: [
        { id: 0, image: require('../assets/1.jpg') },
        { id: 1, image: require('../assets/2.jpg') },
        { id: 2, image: require('../assets/3.jpg') },
        { id: 3, image: require('../assets/4.jpg') }
      ],
      list: [
        {
          userId: '1',
          userName: '北京客户您好，我想咨询一下资费问题',
          userImg: require('../assets/fg.png'),
          talkInfo:
            '您好，我想咨询一下资费问题您好，我想咨询一下资费问题您好，我想咨询一下资费问题您好，我想咨询一下资费问题',
          talkTime: '17:25'
        },
        {
          userId: '2',
          userName: '上海客户',
          userImg: '',
          talkInfo: '我这边好像出了点问题',
          talkTime: '昨天'
        },
        {
          userId: '3',
          userName: '北京客户您好，我想咨询一下资费问题',
          userImg: '',
          talkInfo: '我这边好像出了点问题',
          talkTime: '2021-12-22 17:25'
        },
        {
          userId: '4',
          userName: '北京客户您好，我想咨询一下资费问题',
          userImg: '',
          talkInfo: '我这边好像出了点问题',
          talkTime: '2021-12-22 17:25'
        }
      ]
    }
  },
  methods: {
    autoplay () {
      this.mark++
      if (this.mark === this.notice.length) {
        this.mark = 0
      }
    },
    getAllNotice () {
      this.$axios
        .post('/notice/getAllNotice')
        .then(resp => {
          let { data } = resp
          this.notice = data
          console.log(data)
        })
        .catch(err => {
          console.log(err)
        })
    },
    // 2500ms自动调用一次
    play () {
      setInterval(this.autoplay, 3500)
    }
  },
  created () {
    this.play()
    this.getAllNotice()
  },
  name: 'slidePhoto'
}
</script>

<style>
* {
  margin: 0;
  padding: 0;
  list-style: none;
}
.homePageBody{
  display: flex;
}
.homePageBody .responsive{
  margin-left: 260px;
  margin-right: 110px;
  margin-top: 10px;
  margin-bottom: 10px;
  width: 300px;
  height: 300px;
  flex-shrink: 0;
}
.search {
  display: inline-block;
  width: 1000px;
  height: 70px;
  background: rgb(8, 7, 7, 0.6);
  border-radius: 5px;
}
.search #search-button {
  width: 70px;
  height: 45px;
  top: 12px;
  position: relative;
  border-radius: 5px;
  background-color: orange;
  color: white;
  outline: none;
}
.search #search-input {
  width: 400px;
  height: 45px;
  top: 12px;
  position: relative;
  outline: none;
  border-radius: 5px;
  padding: 10px;
}
.photoText {
  position: absolute;
  width: 100%;
  top: 25px;
  left: 260px;
  z-index: 10;
  text-align: left;
  color: white;
  font-family: Arial, Helvetica, sans-serif;
  font-size: 25px;
  text-shadow: 1px 1px black;
}
.photoText .date {
  display: block;
}
.slidePhoto {
  width: 100%;
  height: 506px;
  margin: 0 auto;
  overflow: hidden;
  position: relative;
}
.photo {
  width: 100%;
  height: 100%;
}
li {
  position: absolute;
  width: 100%;
  height: 100%;
}
a {
  width: 100%;
  height: 100%;
}
img {
  width: 100%;
  height: 100%;
}
.bar {
  position: absolute;
  width: 100%;
  bottom: 10px;
  margin: 0 auto;
  z-index: 10;
  text-align: center;
}
.bar span {
  width: 20px;
  height: 5px;
  border: 1px solid;
  background: white;
  display: inline-block;
  margin-right: 10px;
}
.active {
  background: red !important;
}
.image-enter-active {
  transform: translateX(0);
  transition: all 1.5s ease;
}
.image-leave-active {
  transform: translateX(-100%);
  transition: all 1.5s ease;
}
.image-enter {
  transform: translateX(100%);
}
.image-leave {
  transform: translateX(0);
}
.talkList {
  width: 700px;
  height: calc(100% - 20px);
  background-color: #ffffff;
  border-radius: 4px;
  position: relative;
  margin: 5px 260px 10px auto;
}
#markLabel {
  margin-top: 20px;
  display: block;
  height: 50px;
  text-align: left;
  font-size: larger;
  color: orange;
  border-bottom: solid;
  border-color: orange;
  border-width: 1px;
  position: relative;
  left: 10px;
}
.talkList .talkTag {
  position: relative;
  margin-top: 10px;
  height: calc(100% - 60px);
  overflow: auto;
}

.talkList .talkTag::-webkit-scrollbar {
  display: none;
}

.talkTag .talkbox {
  border-bottom: solid;
  border-color: rgb(228, 228, 228);
  border-width: 1px;
  width: 100%;
  height: 180px;
  padding-top: 15px;
  position: relative;
  box-sizing: content-box;
  display: flex;
}

.talkTag .talkbox:hover {
  background-color: rgb(231, 231, 231);
}

.talkTag .talkbox.active {
  background-color: rgb(201, 201, 201);
}

.talkbox .talkcircle {
  width: 220px;
  height: 150px;
  background-color: rgb(228, 228, 228);
  position: relative;
  top: 12px;
  left: 15px;
  flex-shrink: 0; /* 防止宽度压缩 */
}

.talkcircle .img {
  font-size: 15px;
  position: relative;
  text-align: center;
  width: 100%;
  height: 100%;
}

.talkbox .userName {
  position: relative;
  top: 12px;
  left: 30px;
  font-size: 14px;
  width: 100px;
  height: 19px;
  flex-shrink: 0; /* 防止宽度压缩 */
  white-space: nowrap;
  text-overflow: ellipsis;
  overflow: hidden;
}

.talkbox .talkInfo {
  position: relative;
  top: 37px;
  left: -70px;
  font-size: 12px;
  width: 200px;
  height: 16px;
  color: rgb(153, 153, 153);
  flex-shrink: 0; /* 防止宽度压缩 */
  white-space: nowrap;
  text-overflow: ellipsis;
  overflow: hidden;
}

.talkbox .talkTime {
  position: relative;
  top: 12px;
  right: 150px;
  font-size: 12px;
  width: 100px;
  height: 16px;
  color: rgb(204, 204, 204);
  flex-shrink: 0; /* 防止宽度压缩 */
  text-align: right;
  white-space: nowrap;
}
</style>
