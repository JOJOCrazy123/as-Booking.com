<template>
  <div style="width: 100%;position: relative">

    <el-button @click="showPrev()" type="primary" icon="el-icon-arrow-left" class="pos1"></el-button>
    <el-button @click="showNext()" type="primary" icon="el-icon-arrow-right" class="pos2"></el-button>
    <div style="width: 79%;margin:auto;">

      <VueSlickCarousel v-bind="settings" ref="carousel" style="z-index: 2">

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020042.jpg?k=faeb7e6568ac5cf0b337f94b7b4d51273b0072884264d4e00f00e5bf9ed49cd5&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              无锡
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：154千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020171.jpg?k=3b6e9fb79d1e550bb7c57367b19c9214f93aeb5674b84f3002f5b05bba2056d6&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              德清
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：204千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020012.jpg?k=1acb33f55cf30f1dad42afaac66c2e750dd28192c720f47d4f2eff952d7198e5&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              昆山
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：219千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020146.jpg?k=46bd4adf02d0cf2f93b43d4b2e7541e7bff9e209d0cd9f0a42dcdf0613b312e7&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              黄山风景区
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：226千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020154.jpg?k=85745b02e135ccb60f2fb0e777ea590fcb0cd658c5f8ecca87d76be951f7f8d2&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              杭州
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：238千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/hotel/300x240/346336415.jpg?k=7d001033c3d00da288bd626f2bf43830d18469c476aedde9960d275752797b1b&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              黄山市
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：264千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020095.jpg?k=7c7d6764b2f5481b0a45602686205560843d0abab8db4d814c90e8e5f67db49c&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              淳安
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：275千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020067.jpg?k=6a15e2b25bcf865c1eaa192930b9db54af13a25ece1982b4ce89257733c4a101&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              泰安
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：483千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020174.jpg?k=95c4c20abd045815fcc32a44284242800f75cd4eca1beaa999f87ad74454c503&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              张家界
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：858千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020149.jpg?k=cc8b5c23f25e1530bb6fb1c53922ef6c6bdcae34abcd0cedd8c591afef64a648&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              怀柔
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：938千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020111.jpg?k=143bcad17340dbad78b0d01c43c8f8f3e40500e843967032dd0b6841b0053ca1&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              龙胜
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：1,101千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020158.jpg?k=3d152c16630beeba71bf49338c47069d9d181e2432839ef1e4af2ad17447fa9e&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              桂林
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：1,119千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020022.jpg?k=a222f3cee682add88a84e645440bc0abde19f6c0f2f460414b1a3c967445b97e&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              阳朔
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：1,145千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020018.jpg?k=cdab7525f42f1d9d3a7320da1c9260e606128c9ffe6f3cf1ff95f0138d5a483d&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              银川
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：1,338千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140052530.jpg?k=6ab9ec7d121139c485075c63b7d773433b38312a01ccea6c81faf2329a48f796&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              峨眉山
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：1,484千米
          </div>
          <div>
          </div>
        </div>


      </VueSlickCarousel>
      <div>
        &nbsp;
      </div>
    </div>
  </div>

</template>
<script>

import VueSlickCarousel from "vue-slick-carousel";

export default {
  data() {
    return {
      settings: {
        "arrows":false,
        "dots": false,
        "dotsClass": "slick-dots custom-dot-class",
        "edgeFriction": 0.35,
        "infinite": false,
        "speed": 500,
        "slidesToShow":6,
        "slidesToScroll": 1,
        "draggable": false,
      },
    }
  },
  components:{
    VueSlickCarousel,
  },
  methods: {
    showNext() {
      this.$refs.carousel.next()
    },
    showPrev() {
      this.$refs.carousel.prev()
    },
  },
}
</script>

<style scoped>
.line1{
  /*width: 50px;*/
  display: inline-block;
  height: 24px;
  text-align: center;
  font-size: small;
  color: black;
}
.col1{
  color: #262626;
}
.col2{
  color: #6B6B6B;
}
.line2{
  /*width: 100px;*/
  display: inline-block;
  height: 24px;
  text-align: center;
  font-size: small;
}
.pos1{
  position: absolute;
  left:9%;
  top:40%;
  z-index: 4;
  color: black;
  width: 15px;
  background: #e5e9f2;
  border: #e5e9f2;
  border-radius: 60px;
}
.pos2{
  position: absolute;
  left:86.5%;
  top:40%;
  z-index: 4;
  color: black;
  width: 12px;
  background: #e5e9f2;
  border: #e5e9f2;
  border-radius: 60px;
}
.wid{
  width :170px;
  height: 136px;
}
.el-col {
  border-radius: 4px;
  width: 23px;
  font-size: small;
  text-align: center;
  height: 24px;
  display: inline-block;
}
.bg-purple-dark {
  background: rgb(0,53,128);
  color: #e5e9f2;
}
</style>