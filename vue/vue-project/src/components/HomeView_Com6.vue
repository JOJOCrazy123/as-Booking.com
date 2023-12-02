<template>
  <div style="width: 100%;position: relative">
    <div>
      &nbsp;
    </div>
    <div style="text-align:left;font-size: 30px;font-weight: bold;width: 79%;margin: auto">入住我们的热门特色住宿</div>
    <div style="text-align: left;font-size: 20px;width: 79%;margin: auto">无论是城堡、别墅、船屋还是冰屋，我们的选择应有尽有</div>
    <el-button @click="showPrev()" type="primary" icon="el-icon-arrow-left" class="pos1"></el-button>
    <el-button @click="showNext()" type="primary" icon="el-icon-arrow-right" class="pos2"></el-button>
    <div style="width: 79%;margin:auto;">

      <VueSlickCarousel v-bind="settings" ref="carousel" style="z-index: 2">

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/hotel/square600/286659200.webp?k=9206fc9239b3e4538c22d04b85213d6d5e6257015022de8a37effd956fcde4b6&o=&s=1" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger">
            <b>
              La Roulotte de Ciney
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:large">
            比利时, Ciney
          </div>
          <div>
            <div class="el-col bg-purple-dark" style="display: inline-block">
              8.4
            </div>
            <div class="line1">
              &nbsp;&nbsp;非常好
            </div>
            <div class="line2">
              &nbsp;&nbsp;·90条客户评价
            </div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/hotel/square600/280950287.webp?k=b984c542b8b1a2ee0e019e4491da338a85b660caa10c5e1197225c5f3052d629&o=&s=1" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger">
            <b>
              Wierszyki Shelters
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:large">
            波兰, Zakopane
          </div>
          <div>
            <div class="el-col bg-purple-dark" style="display: inline-block">
              9.7
            </div>
            <div class="line1">
              &nbsp;&nbsp;优异的
            </div>
            <div class="line2">
              &nbsp;&nbsp;·89条客户评价
            </div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/hotel/square600/132452060.webp?k=8448bab55c87dbb42ab7c6643fbbce542124c908f63f6b36dc3cdc859e60cb0a&o=&s=1" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger">
            <b>
              Ranczo w Dolinie
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:large">
            波兰, Kiszkowo
          </div>
          <div>
            <div class="el-col bg-purple-dark" style="display: inline-block">
              9.5
            </div>
            <div class="line1">
              &nbsp;&nbsp;优异的
            </div>
            <div class="line2">
              &nbsp;&nbsp;·233条客户评价
            </div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/hotel/square600/187855604.webp?k=bbb45aa5b540c7608ea3af52d92b95a215df9af831dd3ae0e4c4cce501e28b1b&o=&s=1" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger">
            <b>
              Tiny House Dreischwesternherz
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:large">
            德国, Trier
          </div>
          <div>
            <div class="el-col bg-purple-dark" style="display: inline-block">
              9.6
            </div>
            <div class="line1">
              &nbsp;&nbsp;优异的
            </div>
            <div class="line2">
              &nbsp;&nbsp;·139条客户评价
            </div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/hotel/square600/178421525.webp?k=262301cdcbef1d33942bb02607906eafdee8dde3106ac5732966a206baeebb04&o=&s=1" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger">
            <b>
              Das rote Haus hinterm Deich
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:large">
            德国, Simonsberg
          </div>
          <div>
            <div class="el-col bg-purple-dark" style="display: inline-block">
              9.3
            </div>
            <div class="line1">
              &nbsp;&nbsp;好极了
            </div>
            <div class="line2">
              &nbsp;&nbsp;·48条客户评价
            </div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/hotel/square600/126764303.webp?k=1887d9e0a796fe553436a57823a481ed3584310d6a940e69cc8db875b110ae66&o=&s=1" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger">
            <b>
              Agriturismo Cabrele
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:large">
            意大利, Santorso
          </div>
          <div>
            <div class="el-col bg-purple-dark" style="display: inline-block">
              9.3
            </div>
            <div class="line1">
              &nbsp;&nbsp;好极了
            </div>
            <div class="line2">
              &nbsp;&nbsp;·212条客户评价
            </div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/hotel/square600/356256733.webp?k=d26e6f029087ccbccf4057b95461d46e7ae18d2aa3dd4247ff6b0a148c10bc33&o=&s=1" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger">
            <b>
              古肯法斯迷你酒店
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:large">
            德国, Lübbenau
          </div>
          <div>
            <div class="el-col bg-purple-dark" style="display: inline-block">
              8.2
            </div>
            <div class="line1">
              &nbsp;&nbsp;非常好
            </div>
            <div class="line2">
              &nbsp;&nbsp;·120条客户评价
            </div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/hotel/square600/154543781.webp?k=ad89bc70ec138736b22947f52b7e0ecbac176026e13c50646147303582d94bcd&o=&s=1" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger">
            <b>
              Carinya Park
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:large">
            澳大利亚, Gembrook
          </div>
          <div>
            <div class="el-col bg-purple-dark" style="display: inline-block">
              9.3
            </div>
            <div class="line1">
              &nbsp;&nbsp;好极了
            </div>
            <div class="line2">
              &nbsp;&nbsp;·33条客户评价
            </div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/hotel/square600/283036728.webp?k=b53dc60651b70813b1a2b12cb3903f54b36f1a04128ab0340ee03b860b0f9c48&o=&s=1" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger">
            <b>
              Gyttja Västergårds
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:large">
            芬兰, Lillandet
          </div>
          <div>
            <div class="el-col bg-purple-dark" style="display: inline-block">
              9.3
            </div>
            <div class="line1">
              &nbsp;&nbsp;好极了
            </div>
            <div class="line2">
              &nbsp;&nbsp;·307条客户评价
            </div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/hotel/square600/332074170.webp?k=9e07443aa7ca1a35645b6572aef736095c3bffbd5e8b00c7633f0578a6c2ec3a&o=&s=1" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger">
            <b>
              Au Cœur des Lacs - Chambres d'hôtes
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:large">
            法国, Gérardmer
          </div>
          <div>
            <div class="el-col bg-purple-dark" style="display: inline-block">
              9.4
            </div>
            <div class="line1">
              &nbsp;&nbsp;好极了
            </div>
            <div class="line2">
              &nbsp;&nbsp;·295条客户评价
            </div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/hotel/square600/92356437.webp?k=9696d60e5b732b17d934f3bddfb71e553dfb8960add90d3e0392968a4e93cfc4&o=&s=1" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger">
            <b>
              La Sapinette
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:large">
            加拿大, Val-David
          </div>
          <div>
            <div class="el-col bg-purple-dark" style="display: inline-block">
              8.7
            </div>
            <div class="line1">
              &nbsp;&nbsp;很棒
            </div>
            <div class="line2">
              &nbsp;&nbsp;·54条客户评价
            </div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/hotel/square600/101174842.webp?k=515b19cd29852207a9e6add777068c1df7931a0dc58ddb80b36af9b605a3a00d&o=&s=1" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger">
            <b>
              MFC Erfurter Seen
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:large">
            德国, Erfurt
          </div>
          <div>
            <div class="el-col bg-purple-dark" style="display: inline-block">
              8.2
            </div>
            <div class="line1">
              &nbsp;&nbsp;非常好
            </div>
            <div class="line2">
              &nbsp;&nbsp;·143条客户评价
            </div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/hotel/square600/73425718.webp?k=9b94b5d27f08138674d3ffd26102dfcabdcac68387586e2d42777515bb39a27f&o=&s=1" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger">
            <b>
              Finca Esperanza
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:large">
            西班牙, Yaiza
          </div>
          <div>
            <div class="el-col bg-purple-dark" style="display: inline-block">
              9.0
            </div>
            <div class="line1">
              &nbsp;&nbsp;好极了
            </div>
            <div class="line2">
              &nbsp;&nbsp;·130条客户评价
            </div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/hotel/square600/106411975.webp?k=53597242e9727e6e44a618b8edbc222c39b6937ac1bbe76761e24a2d796aed62&o=&s=1" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger">
            <b>
              Auberge La Seigneurie Valcartier
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:large">
            加拿大, Saint-Gabriel-de-Valcartier
          </div>
          <div>
            <div class="el-col bg-purple-dark" style="display: inline-block">
              8.2
            </div>
            <div class="line1">
              &nbsp;&nbsp;非常好
            </div>
            <div class="line2">
              &nbsp;&nbsp;·153条客户评价
            </div>
          </div>
        </div>

        <div class="wid">
          <a href="sy">
            <img src="https://ac-a.static.booking.cn/xdata/images/hotel/square600/90166571.webp?k=0b63f507a150b0e5f6e2173786be4374ee7deae468fc1a6443feef111cc01ef5&o=&s=1" class="wid">
          </a>
          <div style="text-align:left;margin:auto;font-size:larger">
            <b>
              Lofthus Camping
            </b>
          </div>
          <div style="text-align:left;margin:auto;font-size:large">
            挪威, Lofthus
          </div>
          <div>
            <div class="el-col bg-purple-dark" style="display: inline-block">
              9.4
            </div>
            <div class="line1">
              &nbsp;&nbsp;好极了
            </div>
            <div class="line2">
              &nbsp;&nbsp;·303条客户评价
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
.col2{
  color: #6B6B6B;
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