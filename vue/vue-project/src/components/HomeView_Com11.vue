<template>
  <div style="width: 100%;position: relative">
    <div>
      &nbsp;
    </div>
    <el-button @click="showPrev()" type="primary" icon="el-icon-arrow-left" class="pos1"></el-button>
    <el-button @click="showNext()" type="primary" icon="el-icon-arrow-right" class="pos2"></el-button>
    <div style="width: 79%;margin:auto;">
      <VueSlickCarousel v-bind="settings" ref="carousel" style="z-index: 2">
        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/hotel/square600/87428762.webp?k=9a065fcd92168145d8c8358701662c76793535597b678efc8f6921c8e3c188e6&o=&s=1" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger">
            <b>
              布达佩斯七季公寓酒店
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:large">
            6区-特蕾西亚城，匈牙利，Budapest
          </div>
          <div style="text-align:left;margin:auto;font-size:large">
            起价 825元
          </div>
          <div>
            <div class="el-col bg-purple-dark" style="display: inline-block">
              8.8
            </div>
            <div class="line1">
              &nbsp;&nbsp;很棒
            </div>
            <div class="line2">
              &nbsp;&nbsp;·7651条客户评价
            </div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/hotel/square600/95058973.webp?k=979587fd2ac8f7777a34758264d557eef57d0e98e58bdaeb121f5b968a20f810&o=&s=1" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger">
            <b>
              奥特连宫公寓
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:large">
            马德里市中心，西班牙，Madrid
          </div>
          <div style="text-align:left;margin:auto;font-size:large">
            起价 1125元
          </div>
          <div>
            <div class="el-col bg-purple-dark" style="display: inline-block">
              8.9
            </div>
            <div class="line1">
              &nbsp;&nbsp;很棒
            </div>
            <div class="line2">
              &nbsp;&nbsp;·2675条客户评价
            </div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/hotel/square600/29466558.webp?k=fa323cf3e030ae6b41c8b475fe2853ae4e9e38148501d68dd5b915905dcea664&o=&s=1" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger">
            <b>
              骑士三码头酒店
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:large">
            伦敦金融城，英国，London
          </div>
          <div style="text-align:left;margin:auto;font-size:large">
            起价 13267元
          </div>
          <div>
            <div class="el-col bg-purple-dark" style="display: inline-block">
              9.5
            </div>
            <div class="line1">
              &nbsp;&nbsp;优异的
            </div>
            <div class="line2">
              &nbsp;&nbsp;·567条客户评价
            </div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/hotel/square600/420377357.webp?k=73f8c029827076805ee781cdf818bb5e5e9b963227d74e4ebe071f3564ae4423&o=&s=1" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger">
            <b>
              斯隆俱乐部公寓
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:large">
            肯辛顿及切尔西，英国，London
          </div>
          <div style="text-align:left;margin:auto;font-size:large">
            起价 4869元
          </div>
          <div>
            <div class="el-col bg-purple-dark" style="display: inline-block">
              9.0
            </div>
            <div class="line1">
              &nbsp;&nbsp;好极了
            </div>
            <div class="line2">
              &nbsp;&nbsp;·134条客户评价
            </div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/hotel/square600/421852968.webp?k=f3889222c82f4a8e3783dddb5f1cc04d6140eeb2d5cb8297817a15aacfe4d191&o=&s=1" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger">
            <b>
              3 Epoques Apartments by Prague Residences
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:large">
            布拉格01，捷克，Praha 1
          </div>
          <div style="text-align:left;margin:auto;font-size:large">
            起价 1212元
          </div>
          <div>
            <div class="el-col bg-purple-dark" style="display: inline-block">
              8.7
            </div>
            <div class="line1">
              &nbsp;&nbsp;很棒
            </div>
            <div class="line2">
              &nbsp;&nbsp;·415条客户评价
            </div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/hotel/square600/117127036.webp?k=cfa1260e7772a9b73e2d7da559672a01a478b111b857e2893a5d2b7a4f7212bc&o=&s=1" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger">
            <b>
              Michalská 2 - Old Town Apartment
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:large">
            布拉格01, 捷克, Prague
          </div>
          <div style="text-align:left;margin:auto;font-size:large">
            起价 674元
          </div>
          <div>
            <div class="el-col bg-purple-dark" style="display: inline-block">
              8.6
            </div>
            <div class="line1">
              &nbsp;&nbsp;很棒
            </div>
            <div class="line2">
              &nbsp;&nbsp;·73条客户评价
            </div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/hotel/square600/421853145.webp?k=140bfc6c54ee753d4a748ee7b5a86c00c988e6fc9bb340c87172ead66a3ea9d5&o=&s=1" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger">
            <b>
              6 Continents Apartments by Prague Residences
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:large">
            布拉格01, 捷克, Prague
          </div>
          <div style="text-align:left;margin:auto;font-size:large">
            起价 723元
          </div>
          <div>
            <div class="el-col bg-purple-dark" style="display: inline-block">
              8.3
            </div>
            <div class="line1">
              &nbsp;&nbsp;非常好
            </div>
            <div class="line2">
              &nbsp;&nbsp;·271条客户评价
            </div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/hotel/square600/126708403.webp?k=d9736601506fabe6637abf33b5169604b4407052c7ef063d96bf7a35f395e89d&o=&s=1" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger">
            <b>
              P&J Luxury Apartments
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:large">
            老城, 波兰, Kraków
          </div>
          <div style="text-align:left;margin:auto;font-size:large">
            起价 1312元
          </div>
          <div>
            <div class="el-col bg-purple-dark" style="display: inline-block">
              8.3
            </div>
            <div class="line1">
              &nbsp;&nbsp;非常好
            </div>
            <div class="line2">
              &nbsp;&nbsp;·291条客户评价
            </div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/hotel/square600/74065680.webp?k=892944ae3b207b552dc2de29bb3354d300e420630efe85ede890a9ec4c48f89a&o=&s=1" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger">
            <b>
              布达佩斯VIP公寓
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:large">
            5区 - 内城 - 利奥波德城, 匈牙利, Budapest
          </div>
          <div style="text-align:left;margin:auto;font-size:large">
            起价 3327元
          </div>
          <div>
            <div class="el-col bg-purple-dark" style="display: inline-block">
              9.8
            </div>
            <div class="line1">
              &nbsp;&nbsp;优异的
            </div>
            <div class="line2">
              &nbsp;&nbsp;·25条客户评价
            </div>
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
import 'vue-slick-carousel/dist/vue-slick-carousel.css'
import 'vue-slick-carousel/dist/vue-slick-carousel-theme.css'
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
        "slidesToShow":4,
        "slidesToScroll": 1,
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
.line2{
  /*width: 100px;*/
  display: inline-block;
  height: 24px;
  text-align: center;
  font-size: small;
}
.col1{
  color: #262626;
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
  width :270px;
  height: 210px;
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