<template>
  <form class="myform">
    <h3 class="headline">{{type}}智行旅游</h3>
    <div class="item">
      <label type="text">账号</label>
      <input type="text" placeholder="请输入账号" v-model="phoneNumber"/></div>
    <div class="item">
      <label type="text">密码</label>
      <input type="password" placeholder="请输入密码" v-model="password"/></div>
    <div class="item" v-show="type==='注册'">
      <label type="file" style="margin-right: 11px;">验证码</label>
        <input type="text" placeholder="请输入右侧图形验证码"/>
        <!-- <img src="./imgs/login-03.png"> -->
      </div>
    <div class="tip" v-if="type==='登录'">忘记密码请联系客服</div>
    <div class="submitBtn" @click="doSubmit">{{type}}</div>
    <div class="toRegist">
      <router-link to="/" v-show="type==='登录'">没有帐号，现在去注册</router-link>
      <router-link to="/login" v-show="type==='注册'">已有帐号，去登录</router-link>
    </div>
  </form>
</template>
<script>
export default {
}
</script>
<style>
  .myform{
    background-color: beige;
    padding: 85px 40px;
    color: white;
  }
  .headline{
    text-align: left;
    font-family: PingFangSC-Semibold, "PingFang SC Semibold", "PingFang SC";
    font-size: 32px;
    font-weight: 650;
    margin-bottom: 47px;
  }
  .item{
    width: 358px;
    height: 48px;
    background-color: white;
    margin-bottom: 16px;
    padding: 14px;
    box-sizing: border-box;
    border-radius: 2px;
    position: relative;
  }
  .item label{
    font-size: 14px;
    font-weight: 400;
    color: #333333;
    line-height: normal;
    font-feature-settings: "kern";
  margin-right: 25px;
  }
  .item input{
    border-style: none;
    outline-style: none;
  }
  .tip{
    text-align: right;
    font-size: 13px;
    margin-bottom: 39px;
  }
  .item.submitBtn{
    background-color: rgb(240, 138, 56);
    text-align: center;
  }
  .item img{
    width: 100px;
    height: 29px;
    right: 0px;
    position: absolute;
    top: 10px;
    right: 22px;
  }
  .toRegist{
    text-align: center;
  }
  .toRegist a{
    color: white;
    text-decoration: none;
  }
</style>
