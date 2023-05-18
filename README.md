# DGAfamilies

Web API for detecting DGA domains via Regex rules. All project constructed on Spring Boot.

## Usage

### Requirements
* JDK 17
* Maven

### Command

```Bash
# Runable
mvn spring-boot:run

# Package & Run
mvn clean package
java -jar DGAfamilies-0.0.1-SNAPSHOT.jar
```

## API Description

### Request

Submit suspicious domain through `domain` parameter.

```
@Get
http://127.0.0.1:8080/dga/regex?domian=[suspicious_domain]
```

### Response

**Matched**

Server will response with a JSON string.

```JSON
{
    "id": [DGA_family_id],
    "name": [DGA_family_name],
    "period": [DGA_usage_period],
    "credits": [Validated_by],
    "description": [DGA_description]
}
```

**Not Matched**

Server will return message `Not matched with current regex rules.`

**Error**

Server will return error message depended on certain situations.

## DGA Families (TBC)
|**ID**|**Family Name**|**Support**|**Examples**|
|------|---------------|-----------|------------|
|-|Alien|N|43e88b1c5efebe50d1648a100e60ca5c.xyz<br>5d7fe91ad025c1d2138016c9ec30ef07.xyz<br>5df5de04153beca428915a77d2deccc7.xyz|
|1|Bamital|Y|bde15d38ecc65c801a6ab50a59cea738.org<br>873c174ca173b5393e93f9571e8a293b.info<br>835c4a878a98b295b881203afd07b27a.co.cc<br>9e4f60b0a080d0070f7ad592b9622742.cz.cc|
|2|BeeBone|Y|ns1.backdates0.com<br>ns1.backdates0.org<br>ns1.backdates0.net|
|-|Bigviktor|N|decidefresh-county.in<br>payculturaltour.org<br>standvisiblereach.rocks|
|3|Bobax|Y|qrwxktojqz.yi.org<br>qbfnof.dyndns.org<br>ttcwzadqxpm.dynserv.com|
|4|Blackhole|Y|uyethhnsehcfqilz.ru<br>wevydrkvywxqfsul.ru|
|5|Bedep|Y|wdgmgvpvztygk5q.com<br>yftwlzxtpozg.com<br>beuzrffkesdroobg.com|
|6|Banjori|Y|earnestnessbiophysicalohax.com<br>kwtoestnessbiophysicalohax.com<br>rvcxestnessbiophysicalohax.com|
|7|CCleaner DGA|Y|ab1145b758c30.com<br>ab6d54340c1a.com<br>ab3d685a0c37.com|
|8|Conficker|Y|ntpyocx.info<br>kfoqmgax.com<br>eiwzqeaosf.info|
|9|Cryptolocker|Y|bqwqeiswupyny.org<br>oocevdwyruhdi.co.uk<br>xhlwkqdawjdpi.info|
|10|Corebot|Y|3lgrupwdivsfm2w4kng2iha.ddns.net<br>i8a0q2wdu8otulkfylo2gdq.ddns.net<br>kh1her76avy0qnelivijwd1.ddns.net|
|11|Chir|Y|ade34ea82c4f7f2f.net<br>f661e398d876c6f7.cn<br>153ab420f93bf8c2.cn|
|12|Chinad|Y|q60coxnn83zj7i9u.org<br>oyvnvk7r7tdrc8ys.org<br>yredlgl5w4g7kxkb.cn|
|13|Darkshell|Y|003zzy.com<br>903qzy.com<br>E03ezy.com|
|14|DNS Changer|Y|xyinotlgjm.com<br>pzebjxgftf.com<br>jsgjmbtbdr.com|
|15|Dyre|Y|aa1442a1beba3793bbde2582b4127b66ae.cc<br>b1ca5eebd8e0eb8ea6b61eaccbde527c26.ws<br>cdca364b71f0c8506d60eb2939f4b806d9.to|
|16|DirCrypt|Y|wbgzpjfxlxlcvbth.com<br>pibqzedhzwt.com<br>vlbqryjd.com|
|17|DiamondFox|Y|r1yrw2i.org<br>3buy35f.net<br>ddcuhr7.com|
|18|EKforward|Y|bd7d817a.eu|
|19|Emotet.C|Y|fureeqnicoyejedm.eu<br>fvpuplocfrdcuqon.eu<br>fyaejobuvwukraga.eu|
|20|Feodo|Y|hmvmgywkvayilcwh.ru<br>xvmzegestulhtvqz.ru<br>hjpyvexsutdctjol.ru|
|21|Fobber|Y|vhkintjtksyxgjrzz.net<br>ukfmknjdenthvktgc.net<br>btpnxlsfdqbhzazyx.net|
|22|Gspy|Y|919921c772bf23e6.net<br>9c3b4fe3fba848a3.net<br>542703c273588fbf.net|
|23|Gozi(Days+Monthly+Seasonal)|Y|districtsofficersamount.net<br>governmentsthemmerciless.cn<br>circummostdeclare.biz|
|24|GozNym 2nd Stage|Y|pwvqtx.com<br>toyvsgu.com<br>bejslgoeby.com|
|25|Gameover P2P|Y|qguovypzsghmtijhljtsnflnnft.ru<br>myduodyxtemrcpfproteimzce.com<br>wsskljhihuamxcqswgkrrwdxk.net|
|26|Gameover DGA|Y|1pb98u4egqbcwzes185mpfyvc.com<br>1phu3tw1xne48hy0s8df17ktgb0.net<br>gyjcf918ifxjyi07gt011pu5k8.biz|
|27|Hesperbot|Y|lltccvgytdzmzywdscuynaxp.com<br>iksjxihh.com<br>nbttcccbbjz.com|
|28|Infy|Y|3b580fa7.top<br>abe71236.net<br>dce022a0.space|
|29|Locky|Y|hrgcmmihpxth.in<br>cbkmotlvy.yt<br>ecsiequ.pm|
|30|MadMax DGA|Y|www.mdfpzugyee.org<br>www.9qnr6oyssk.org<br>www.s82r4luxrw.com|
|31|Mirai|Y|vmdefmnsdoj.tech<br>xpknpxmywqsr.online<br>oornsduuwjli.tech|
|32|Matsnu DGA|Y|saladdoctortrainer.com<br>strangerbiketechnology.com<br>termacceptyear.com|
|33|ModPack (Andromeda?)|Y|dx9eaz6k85.ru<br>k1y5u25h.ru<br>q1pv38gd.ru|
|34|Murofet|Y|vpevhtorzutawui.info<br>vpevhtorzutawui.com|
|35|Nymaim|Y|pcxeyx.biz<br>pnrbassntqm.net<br>cahialivr.info|
|36|Necurs|Y|vyguwpynyxaxld.in<br>dxkxbmytfsgbkagoc.com<br>caxadsjuygrem.ac|
|37|Oderoor|Y|gwbgmsmhgsp.com<br>bizyssylscs.com<br>egbmbdey.net|
|38|Omexo|Y|fff1834cbcd5ba96ca75fdae9c44cf5d.net<br>75305ca65aff1efeaf8e20efc8671f5c.net<br>6a860e3b63758e43aa2c570bbb4e4ecf.net|
|-|Orchard|N|867e6101.com<br>abf88222.duckdns.org<br>abf88222.net|
|39|Proslikefan DGA|Y|jsfupqzg.org<br>udahqhqz.ru<br>bqbawzavbp.in|
|40|PandaBanker DGA|Y|95a4e6473c78.net<br>5d19cbf688d4.com<br>28f46950ab54.net|
|41|Pushdo(TID version)|Y|xirgbebore.tv<br>ahujctulsb.org<br>olofapmxgl.net|
|42|Pykspa|Y|oxcnrkwzjclh.info<br>jooqdxv.org<br>jkyyhincbuv.net|
|43|Pykspa 2|Y|aajyvkdsholapet.org<br>ybilumnansnan.com<br>ishstqeoya.info|
|44|PadCrypt|Y|nlbncldflcaobbcf.com<br>mdfeedbdfbfdcabo.info<br>cadbncmlffkcclkb.cc|
|45|Pushdo|Y|qaqicvofe.com<br>cumocuwupjo.com<br>cumocuwu.kz|
|-|PseudoManuscrypt|N|qpaorhfgbh.com<br>qhjjmernhf.com<br>fboppoqmde.com|
|46|Qadars|Y|mvkpybw5i3wx.org<br>v8l6bshunstq.net<br>sh238d2fctaf.com|
|47|QakBot|Y|hluvupofr.net<br>qxkxqfcipcectpiaiatycab.biz<br>trrexdawflbxho.net|
|48|Ranbyus|Y|vrjpqnxfonvapg.pw<br>tpwdrsmdopnqcu.in<br>gnajdybsuaimhw.me|
|49|Redyms|Y|erdoypf-inr.net<br>reqblcsh-a.net<br>anzku-bqe.net|
|50|Ramdo|Y|skmymmeiaoooigke.org<br>ocqiwseygwqyeuma.org<br>ceigqweqwaywiqgu.org|
|51|Rovnix|Y|sgkz3ynabqekrma1p6.com<br>gu4z7va5lnuyppay7a.cn<br>nn4rzw6r4yv4ezapuu.ru|
|52|Ramnit|Y|mukevipvxvrq.com<br>nhedwmmg.com<br>egopuefrdsefc.com|
|53|Szribi|Y|auaopagr.com<br>tutuitqf.com<br>ododgoqs.com|
|54|Symmi|Y|urasahrenaheen.ddns.net<br>vitevecaasbaim.ddns.net<br>qularivafou.ddns.net|
|55|Sphinx Zeus DGA|Y|muvrhrutgrlmcfog.com<br>cxhktdxrvrsiibnh.com<br>qeygqpabwinmaoxn.com|
|56|Shifu|Y|lwvsbqd.eu<br>dxnrlqj.eu<br>ldhbnms.eu|
|57|Sutra TDS|Y|gcmzriojwptjrrrh.ru<br>efwdcidrzwpiirhj.ru<br>wogrrgzpwwtjwhww.mynumber.org|
|58|SuppoBox|Y|perhapsmeasure.net<br>windowafraid.net<br>wintermeasure.net|
|59|Sisron|Y|mdewnjiwmtya.net<br>mjkwntiwmtya.org<br>mjuwntiwmtya.com|
|60|Simda|Y|cihunemyror.eu<br>digivehusyd.eu<br>vofozymufok.eu|
|61|Tofsee DGA|Y|dqhdqha.biz<br>dqhdqhb.ch<br>dqhdqhj.biz|
|62|Tsifiri|Y|0-0-0-0-0-0-0-0-0-0-0-0-0-1-0-0-0-0-0-0-0-0-0-0-0-0-0.info<br>0-0-0-0-0-0-0-0-0-0-0-0-0-2-0-0-0-0-0-0-0-0-0-0-0-0-0.info<br>0-0-0-0-0-0-0-0-0-0-0-0-0-3-0-0-0-0-0-0-0-0-0-0-0-0-0.info|
|63|TinyBanker DGA|Y|ghefvfkkxtgg.ru<br>mqsqytogddne.ru<br>hosgnecdevwt.ru|
|64|Tempedreve TDD|Y|wrqzuhirg.org<br>gihtwmhmw.net<br>idqdsfspa.com|
|65|Tempedreve|Y|sxilgdils.com<br>sipuecmzxk.info<br>ozrnlglgb.info|
|66|Torpig|Y|ueupulj.com<br>xgrrunj.net<br>vgpsuag.biz|
|67|Urlzone|Y|e3oa4wglvd21xa.com<br>mqmq1hvmtxzjv.net<br>pd4o4wu24vimn.com|
|68|UD4|Y|snbhdfln.com<br>snfrpmnq.org<br>snvspnor.in<br>snmvspru.net<br>snpnwsuy.ru|
|69|Vidro(TID)|Y|pbeqeggzhk.dyndns.org<br>jxsaumg.com<br>hziddfcv.net|
|70|Vawtrak|Y|fonizwhgnqp.ru<br>ajabunorsxu.ru<br>rktglonmful.ru|
|71|Virut|Y|uiaiub.com<br>unogau.com<br>vwykzx.com|
|72|VolatileCedar|Y|xploreredotnte.info<br>oreredotntexpl.info<br>tnexploreredot.info|
|73|WD|Y|wd7bdb20e4d622f6569f3e8503138c859d.win|
|74|XxHex DGA|Y|xxfddc1b01.at<br>xxfeee0d8.fm<br>xx83603fbb.tk|
