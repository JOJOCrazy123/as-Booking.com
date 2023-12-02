<template>
  <div style="width: 100%;position: relative">

    <el-button @click="showPrev()" type="primary" icon="el-icon-arrow-left" class="pos1"></el-button>
    <el-button @click="showNext()" type="primary" icon="el-icon-arrow-right" class="pos2"></el-button>
    <div style="width: 79%;margin:auto;">

      <VueSlickCarousel v-bind="settings" ref="carousel" style="z-index: 2">

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/hotel/300x240/210091629.jpg?k=dbd634b081fcd0b871474be9360e0e9f4bbc9cdf3e73a7c006862e529e574a0d&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              舟山
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：389千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020091.jpg?k=1142ac0a53bc751f99d4f7b84795d50227bd1a90e8ea45b9f975f4a8c565d380&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              青岛
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：469千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020020.jpg?k=7728db0712f1d11c5a63808c245a910ed9505d2a857ec1cf40e86e2273b904e7&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              烟台
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：654千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020172.jpg?k=496cb967af80535bbf8cfa4ac04a00faf62ba5c103171f4a1494a2ac53858209&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              蓬莱
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：664千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020185.jpg?k=1cc928c13d45fe31ec5742aba1b5148783bc4205729ec0ce42584355d0f0bcf8&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              大连
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：806千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020094.jpg?k=a1a674ebad56060da11741070c3462c9aa8b59a93fb7a244564fb38b22f85460&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              惠东
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：1,086千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020143.jpg?k=78bd09cbf02b918171e64ffafb0fc33e3fcd8cf464a6284a12bae4275efa8af1&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              惠州
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：1,087千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020113.jpg?k=43491ec4eae99c2067fb0e058d603ffc443307ed671f66e1326ccb7bed0aba74&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              龙岗
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：1,129千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/hotel/300x240/117211287.jpg?k=47c4b7f343bf99ddbb17943bfd787f30a992522f4c3356e97584540659428cc2&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              大鹏新区
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：1,135千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020036.jpg?k=20d2bee65c20c39e3ffb109c3939bd81dc53e1a620b3927ab44221b59c566ae8&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              珠海
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：1,203千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020140.jpg?k=0f249b60a56a4bb06b1080f8950b62a9b937cbd0a8c591e3850a719241d9dae7&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              阳江
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：1,320千米
          </div>
          <div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/xphoto/300x240/140020008.jpg?k=aba81e25c12b344523e402c87fe8eac925d18e271bd19e649b5c4862d409f660&o=" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger" class="col1">
            <b>
              湛江
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:x-small" class="col2">
            距离：1,467千米
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