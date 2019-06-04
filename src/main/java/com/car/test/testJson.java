package com.car.test;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.car.pojo.CarDetail;
import org.junit.Test;

import java.util.List;

public class testJson {
    String s = "[{\"glass_rearviewmirror\":{\"rearsideshade\":\"-\",\"rearviewmirrorheated\":\"●\",\"num\":\"25379\",\"theeearviewmirrorfoldselectrically\":\"-\",\"rearviewmirrormemory\":\"-\",\"sunsisormirror\":\"●\",\"rearprivacyglass\":\"-\",\"uvHeatresistantglass\":\"●\",\"carwindowantiPinchfunction\":\"●\",\"rearwiper\":\"●\",\"rainSensingwipers\":\"-\",\"frontRearpowerwindows\":\"●/●\",\"therearviewmirrorelectricallyadjusted\":\"●\",\"innerOuterrearviewmirrorautomaticallypreventsglare\":\"-\",\"rearwindscreenshade\":\"-\"},\"light_configuration\":{\"autolight\":\"-\",\"headlampcleaningdevice\":\"-\",\"adaptivetonearandfarlight\":\"-\",\"highbeam\":\"卤素\",\"frontfoglamp\":\"-\",\"num\":\"25379\",\"steeringheadlamp\":\"-\",\"theheadlampheightisadjustable\":\"●\",\"dippedheadlight\":\"卤素\",\"corneringlamp\":\"-\",\"daytimerunninglight\":\"-\",\"interioratmospherelamp\":\"-\"},\"engine\":{\"airintakeform\":\"自然吸气\",\"distributionagency\":\"DOHC\",\"maximumpower\":\"66\",\"cylinderbodymaterial\":\"铝\",\"cylinderheadmaterial\":\"铝\",\"num\":\"25379\",\"numberofvalvespercylinder\":\"4\",\"environmentalprotectionstandard\":\"国V\",\"maximumn_m\":\"132\",\"enginemodel\":\"EA211\",\"compressionratio\":\"-\",\"cylinderarrangement\":\"L\",\"fuellabel\":\"92号\",\"trip\":\"-\",\"maximumpowerrpm\":\"5500\",\"oilsupplyway\":\"多点电喷\",\"thecylinderdiameter\":\"-\",\"fuelform\":\"汽油\",\"numberofcylinders\":\"4\",\"maximumhorsepower\":\"90\",\"displacement\":\"1395\",\"maximumrpm\":\"3800\",\"cvvt\":\"-\"},\"media_configuration\":{\"cd\":\"-\",\"tv\":\"-\",\"bluetoothCarphone\":\"-\",\"rearlcd\":\"-\",\"num\":\"25379\",\"gps\":\"-\",\"numberofspeakers\":\"4-5喇叭\",\"powersupply220v230v\":\"-\",\"locationinteractiveservice\":\"-\",\"externalaudiosourceinterface\":\"USB+AUX+SD卡插槽\",\"dynaudio\":\"-\",\"mediasystem\":\"-\",\"centerconsolelargecolorscreen\":\"-\"},\"ac_refrigerator\":{\"num\":\"25379\",\"inCarairconditioningPollenfiltration\":\"●\",\"rearseathvacducts\":\"-\",\"airconditioningcontrolmode\":\"手动\",\"carrefrigerator\":\"-\",\"temperaturezoningcontrol\":\"-\",\"rearindependentairconditioning\":\"-\"},\"high_tech_configuration\":{\"automaticparking\":\"-\",\"integralactivesteering\":\"-\",\"panoramiccamera\":\"-\",\"ldws\":\"-\",\"centralcontrollcdsplitscreendisplay\":\"-\",\"num\":\"25379\",\"activebrakeActivesafetysystem\":\"-\",\"gsg\":\"-\",\"selfAdaptivecruisecontrol\":\"-\",\"doublingtheauxiliary\":\"-\",\"nightcisionsystem\":\"-\"},\"body\":{\"backwheeltrack\":\"-\",\"num\":\"25379\",\"length\":\"3970\",\"bodystructure\":\"两厢车\",\"numberofseat\":\"5\",\"numberofdoor\":\"5\",\"trunkvolume\":\"250\",\"frontwheeltrack\":\"-\",\"wheelbase\":\"2470\",\"tankvolume\":\"45\",\"width\":\"1682\",\"minimumgroundclearance\":\"-\",\"curbweight\":\"1060\",\"height\":\"1462\"},\"external_configuration\":{\"aluminiumalloyrim\":\"-\",\"slidingdoor\":\"-\",\"electrictrunk\":\"-\",\"electricsuctiondoor\":\"-\",\"inductiontrunk\":\"-\",\"num\":\"25379\",\"powersunroof\":\"-\",\"panoramicsunroof\":\"-\",\"roofrack\":\"-\",\"sportsappearancesuite\":\"-\"},\"chassis_steering\":{\"powertype\":\"电动助力\",\"rearsuspensiontype\":\"扭力梁式非独立悬架\",\"carbodystructure\":\"承载式\",\"num\":\"25379\",\"drivemodel\":\"前置前驱\",\"frontsuspensiontype\":\"麦弗逊式独立悬架\"},\"control_configuration\":{\"ebaBasBa\":\"-\",\"automaticparking\":\"-\",\"hillauxiliary\":\"-\",\"hdc\":\"-\",\"num\":\"25379\",\"variablesteeringratio\":\"-\",\"rearaxlelimitedslipdifferentialDifferentiallock\":\"-\",\"ebdCbc\":\"●\",\"centraldifferentiallockingfunction\":\"-\",\"abs\":\"●\",\"variablesuspension\":\"-\",\"asrTcsTrc\":\"-\",\"frontaxlelimitedslipdifferentialDifferentiallock\":\"-\",\"airsuspension\":\"-\"},\"carnum\":\"25379\",\"internal_configuration\":{\"leathersteeringwheel\":\"-\",\"num\":\"25379\",\"fulllcdpanel\":\"-\",\"steeringwheelcontrol\":\"上下调节\",\"steeringmemory\":\"-\",\"electricsteeringwheelcontrol\":\"-\",\"mfl\":\"-\",\"rearvideo\":\"-\",\"hud\":\"-\",\"drivingcomputerdisplayscreen\":\"-\",\"cruise\":\"-\",\"heatedsteeringwheel\":\"-\",\"frontRearparkingradar\":\"-\",\"steeringwheelshift\":\"-\"}},{\"glass_rearviewmirror\":{\"rearsideshade\":\"-\",\"rearviewmirrorheated\":\"●\",\"num\":\"25381\",\"theeearviewmirrorfoldselectrically\":\"-\",\"rearviewmirrormemory\":\"-\",\"sunsisormirror\":\"●\",\"rearprivacyglass\":\"-\",\"uvHeatresistantglass\":\"●\",\"carwindowantiPinchfunction\":\"●\",\"rearwiper\":\"●\",\"rainSensingwipers\":\"-\",\"frontRearpowerwindows\":\"●/●\",\"therearviewmirrorelectricallyadjusted\":\"●\",\"innerOuterrearviewmirrorautomaticallypreventsglare\":\"-\",\"rearwindscreenshade\":\"-\"},\"light_configuration\":{\"autolight\":\"-\",\"headlampcleaningdevice\":\"-\",\"adaptivetonearandfarlight\":\"-\",\"highbeam\":\"卤素\",\"frontfoglamp\":\"●\",\"num\":\"25381\",\"steeringheadlamp\":\"-\",\"theheadlampheightisadjustable\":\"●\",\"dippedheadlight\":\"卤素\",\"corneringlamp\":\"-\",\"daytimerunninglight\":\"-\",\"interioratmospherelamp\":\"-\"},\"engine\":{\"airintakeform\":\"自然吸气\",\"distributionagency\":\"DOHC\",\"maximumpower\":\"81\",\"cylinderbodymaterial\":\"铝\",\"cylinderheadmaterial\":\"铝\",\"num\":\"25381\",\"numberofvalvespercylinder\":\"4\",\"environmentalprotectionstandard\":\"国V\",\"maximumn_m\":\"155\",\"enginemodel\":\"EA211\",\"compressionratio\":\"-\",\"cylinderarrangement\":\"L\",\"fuellabel\":\"92号\",\"trip\":\"-\",\"maximumpowerrpm\":\"5800\",\"oilsupplyway\":\"多点电喷\",\"thecylinderdiameter\":\"-\",\"fuelform\":\"汽油\",\"numberofcylinders\":\"4\",\"maximumhorsepower\":\"110\",\"displacement\":\"1598\",\"maximumrpm\":\"3800\",\"cvvt\":\"-\"},\"media_configuration\":{\"cd\":\"●\",\"tv\":\"-\",\"bluetoothCarphone\":\"●\",\"rearlcd\":\"-\",\"num\":\"25381\",\"gps\":\"-\",\"numberofspeakers\":\"6-7喇叭\",\"powersupply220v230v\":\"-\",\"locationinteractiveservice\":\"-\",\"externalaudiosourceinterface\":\"USB+AUX+SD卡插槽\",\"dynaudio\":\"-\",\"mediasystem\":\"单碟CD\",\"centerconsolelargecolorscreen\":\"-\"},\"ac_refrigerator\":{\"num\":\"25381\",\"inCarairconditioningPollenfiltration\":\"●\",\"rearseathvacducts\":\"-\",\"airconditioningcontrolmode\":\"手动\",\"carrefrigerator\":\"-\",\"temperaturezoningcontrol\":\"-\",\"rearindependentairconditioning\":\"-\"},\"high_tech_configuration\":{\"automaticparking\":\"-\",\"integralactivesteering\":\"-\",\"panoramiccamera\":\"-\",\"ldws\":\"-\",\"centralcontrollcdsplitscreendisplay\":\"-\",\"num\":\"25381\",\"activebrakeActivesafetysystem\":\"-\",\"gsg\":\"-\",\"selfAdaptivecruisecontrol\":\"-\",\"doublingtheauxiliary\":\"-\",\"nightcisionsystem\":\"-\"},\"body\":{\"backwheeltrack\":\"-\",\"num\":\"25381\",\"length\":\"3970\",\"bodystructure\":\"两厢车\",\"numberofseat\":\"5\",\"numberofdoor\":\"5\",\"trunkvolume\":\"250\",\"frontwheeltrack\":\"-\",\"wheelbase\":\"2470\",\"tankvolume\":\"45\",\"width\":\"1682\",\"minimumgroundclearance\":\"-\",\"curbweight\":\"1075\",\"height\":\"1462\"},\"external_configuration\":{\"aluminiumalloyrim\":\"○\",\"slidingdoor\":\"-\",\"electrictrunk\":\"-\",\"electricsuctiondoor\":\"-\",\"inductiontrunk\":\"-\",\"num\":\"25381\",\"powersunroof\":\"●\",\"panoramicsunroof\":\"-\",\"roofrack\":\"-\",\"sportsappearancesuite\":\"-\"},\"chassis_steering\":{\"powertype\":\"电动助力\",\"rearsuspensiontype\":\"扭力梁式非独立悬架\",\"carbodystructure\":\"承载式\",\"num\":\"25381\",\"drivemodel\":\"前置前驱\",\"frontsuspensiontype\":\"麦弗逊式独立悬架\"},\"control_configuration\":{\"ebaBasBa\":\"○\",\"automaticparking\":\"-\",\"hillauxiliary\":\"-\",\"hdc\":\"-\",\"num\":\"25381\",\"variablesteeringratio\":\"-\",\"rearaxlelimitedslipdifferentialDifferentiallock\":\"-\",\"ebdCbc\":\"●\",\"centraldifferentiallockingfunction\":\"-\",\"abs\":\"●\",\"variablesuspension\":\"-\",\"asrTcsTrc\":\"○\",\"frontaxlelimitedslipdifferentialDifferentiallock\":\"-\",\"airsuspension\":\"-\"},\"carnum\":\"25381\"}]";
    JSONArray jsonArray;

    {
        try {
            jsonArray =  JSONArray.parseArray(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void parseCarDetail(){

        List<CarDetail> carDetails = null;
        carDetails = JSON.parseArray(jsonArray.toJSONString(),CarDetail.class);
        String S ;
        List<CarDetail> carDetails32= null;
      //  com.alibaba.fastjson.JSONObject jsonPara1 = json.getJSONObject("carDetail1");
      //  com.alibaba.fastjson.JSONObject jsonParaInternal_configuration = jsonPara1.getJSONObject("Internal_configuration");
     //   String s = jsonParaInternal_configuration.toJSONString();
//
//        Internal_configuration ca String SS = "[{\n" +
//                "\t\"leathersteeringwheel\": \"-\",\n" +
//                "\t\"num\": \"25379\",\n" +
//                "\t\"fulllcdpanel\": \"-\",\n" +
//                "\t\"steeringwheelcontrol\": \"上下调节\",\n" +
//                "\t\"steeringmemory\": \"-\",\n" +
//                "\t\"electricsteeringwheelcontrol\": \"-\",\n" +
//                "\t\"mfl\": \"-\",\n" +
//                "\t\"rearvideo\": \"-\",\n" +
//                "\t\"hud\": \"-\",\n" +
//                "\t\"drivingcomputerdisplayscreen\": \"-\",\n" +
//                "\t\"cruise\": \"-\",\n" +
//                "\t\"heatedsteeringwheel\": \"-\",\n" +
//                "\t\"frontRearparkingradar\": \"-\",\n" +
//                "\t\"steeringwheelshift\": \"-\"\n" +
//                "}]";rDetail1 = JSON.parseObject(JSON.toJSONString(jsonParaInternal_configuration), Internal_configuration.class);
//        List<Internal_configuration> channelItemList  = JSON.parseArray(SS,Internal_configuration.class);
//        com.alibaba.fastjson.JSONObject jsonPara2 = json.getJSONObject("carDetail2");
//        CarDetail carDetail2 = JSON.toJavaObject(jsonPara1,CarDetail.class);
        //carDetails.add(carDetail1);
        //carDetails.add(carDetail2);
        //return carDetails;
    }
}
