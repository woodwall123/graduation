<template>
<div>
  <div class="slidePhoto">
      <div class="photo">
            <a href="#">
              <img :src="image" />
            </a>
      </div>
      <div class="photoText">
        <label class="date" for=""> 24/Dec.2021 </label>
        <label for="">拯救周末计划 |</label>
        <label for="">正文：你是否想要体验云南景色</label>
      </div>
    </div>
</div>
</template>

<script>

export default {
  name: 'destination',
  data () {
    return {
      image: require('../assets/1.jpg')
    }
  }
}
</script>
<style>
</style>
