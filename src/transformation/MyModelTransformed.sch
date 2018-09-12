<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<eagle version="6.6.0">
<drawing>
<settings>
<setting alwaysvectorfont="no"/>
<setting verticaltext="up"/>
</settings>
<grid altdistance="0.01" altunit="inch" altunitdist="inch" display="no" distance="0.1" multiple="1" style="lines" unit="inch" unitdist="inch"/>
<layers>
<layer active="no" color="4" fill="1" name="Top" number="1" visible="no"/>
<layer active="no" color="1" fill="1" name="Bottom" number="16" visible="no"/>
<layer active="no" color="2" fill="1" name="Pads" number="17" visible="no"/>
<layer active="no" color="2" fill="1" name="Vias" number="18" visible="no"/>
<layer active="no" color="6" fill="1" name="Unrouted" number="19" visible="no"/>
<layer active="no" color="15" fill="1" name="Dimension" number="20" visible="no"/>
<layer active="no" color="7" fill="1" name="tPlace" number="21" visible="no"/>
<layer active="no" color="7" fill="1" name="bPlace" number="22" visible="no"/>
<layer active="no" color="15" fill="1" name="tOrigins" number="23" visible="no"/>
<layer active="no" color="15" fill="1" name="bOrigins" number="24" visible="no"/>
<layer active="no" color="7" fill="1" name="tNames" number="25" visible="no"/>
<layer active="no" color="7" fill="1" name="bNames" number="26" visible="no"/>
<layer active="no" color="7" fill="1" name="tValues" number="27" visible="no"/>
<layer active="no" color="7" fill="1" name="bValues" number="28" visible="no"/>
<layer active="no" color="7" fill="3" name="tStop" number="29" visible="no"/>
<layer active="no" color="7" fill="6" name="bStop" number="30" visible="no"/>
<layer active="no" color="7" fill="4" name="tCream" number="31" visible="no"/>
<layer active="no" color="7" fill="5" name="bCream" number="32" visible="no"/>
<layer active="no" color="6" fill="3" name="tFinish" number="33" visible="no"/>
<layer active="no" color="6" fill="6" name="bFinish" number="34" visible="no"/>
<layer active="no" color="7" fill="4" name="tGlue" number="35" visible="no"/>
<layer active="no" color="7" fill="5" name="bGlue" number="36" visible="no"/>
<layer active="no" color="7" fill="1" name="tTest" number="37" visible="no"/>
<layer active="no" color="7" fill="1" name="bTest" number="38" visible="no"/>
<layer active="no" color="4" fill="11" name="tKeepout" number="39" visible="no"/>
<layer active="no" color="1" fill="11" name="bKeepout" number="40" visible="no"/>
<layer active="no" color="4" fill="10" name="tRestrict" number="41" visible="no"/>
<layer active="no" color="1" fill="10" name="bRestrict" number="42" visible="no"/>
<layer active="no" color="2" fill="10" name="vRestrict" number="43" visible="no"/>
<layer active="no" color="7" fill="1" name="Drills" number="44" visible="no"/>
<layer active="no" color="7" fill="1" name="Holes" number="45" visible="no"/>
<layer active="no" color="3" fill="1" name="Milling" number="46" visible="no"/>
<layer active="no" color="7" fill="1" name="Measures" number="47" visible="no"/>
<layer active="no" color="7" fill="1" name="Document" number="48" visible="no"/>
<layer active="no" color="7" fill="1" name="Reference" number="49" visible="no"/>
<layer active="no" color="7" fill="1" name="tDocu" number="51" visible="no"/>
<layer active="no" color="7" fill="1" name="bDocu" number="52" visible="no"/>
<layer color="2" fill="1" name="Nets" number="91"/>
<layer color="1" fill="1" name="Busses" number="92"/>
<layer color="2" fill="1" name="Pins" number="93" visible="no"/>
<layer color="4" fill="1" name="Symbols" number="94"/>
<layer color="7" fill="1" name="Names" number="95"/>
<layer color="7" fill="1" name="Values" number="96"/>
<layer color="7" fill="1" name="Info" number="97"/>
<layer color="6" fill="1" name="Guide" number="98"/>
</layers>
<schematic xreflabel="%F%N/%S.%C%R" xrefpart="/%S.%C%R">
<libraries>
<library name="transistor-fet">
<description>&lt;b&gt;Field Effect Transistors&lt;/b&gt;&lt;p&gt;
&lt;author&gt;Created by librarian@cadsoft.de&lt;/author&gt;&lt;p&gt;
&lt;p&gt;
Symbols changed according to IEC617&lt;p&gt; 
All types, packages and assignment to symbols and pins checked&lt;p&gt;
Package outlines partly checked&lt;p&gt;
&lt;p&gt;
JFET = junction FET&lt;p&gt;
IGBT-x = insulated gate bipolar transistor&lt;p&gt;
x=N: NPN; x=P: PNP&lt;p&gt;
IGFET-mc-nnn; (IGFET=insulated gate field effect transistor)&lt;P&gt;
m=D: depletion mode (Verdr&amp;auml;ngungstyp)&lt;p&gt;
m=E: enhancement mode (Anreicherungstyp)&lt;p&gt;
c: N=N-channel; P=P-Channel&lt;p&gt;
GDSB: gate, drain, source, bulk&lt;p&gt;
&lt;p&gt;
by R. Vogg  15.March.2002</description>
<packages>
<package name="TO92">
<description>&lt;b&gt;TO 92&lt;/b&gt;</description>
<wire curve="-32.781" layer="21" width="0.127" x1="-2.0946" x2="-2.6549" y1="-1.651" y2="-0.254"/>
<wire curve="-78.3185" layer="21" width="0.127" x1="-2.6549" x2="-0.7863" y1="-0.254" y2="2.5485"/>
<wire curve="-111.1" layer="21" width="0.127" x1="0.7863" x2="2.0945" y1="2.5484" y2="-1.651"/>
<wire layer="21" width="0.127" x1="-2.0945" x2="2.0945" y1="-1.651" y2="-1.651"/>
<wire layer="51" width="0.127" x1="-2.2537" x2="-0.2863" y1="-0.254" y2="-0.254"/>
<wire layer="21" width="0.127" x1="-2.6549" x2="-2.2537" y1="-0.254" y2="-0.254"/>
<wire layer="21" width="0.127" x1="-0.2863" x2="0.2863" y1="-0.254" y2="-0.254"/>
<wire layer="21" width="0.127" x1="2.2537" x2="2.6549" y1="-0.254" y2="-0.254"/>
<wire layer="51" width="0.127" x1="0.2863" x2="2.2537" y1="-0.254" y2="-0.254"/>
<wire curve="-34.2936" layer="51" width="0.127" x1="-0.7863" x2="0.7863" y1="2.5485" y2="2.5485"/>
<text layer="25" ratio="10" size="1.27" x="3.175" y="0.635">&gt;NAME</text>
<text layer="27" ratio="10" size="1.27" x="3.175" y="-1.27">&gt;VALUE</text>
<text layer="51" ratio="10" size="1.27" x="-0.635" y="0.635">2</text>
<text layer="51" ratio="10" size="1.27" x="-2.159" y="0.0">3</text>
<text layer="51" ratio="10" size="1.27" x="1.143" y="0.0">1</text>
<pad drill="0.8128" name="1" shape="octagon" x="1.27" y="0.0"/>
<pad drill="0.8128" name="2" shape="octagon" x="0.0" y="1.905"/>
<pad drill="0.8128" name="3" shape="octagon" x="-1.27" y="0.0"/>
</package>
<package name="TO202">
<description>&lt;b&gt;TO 202 horizontal&lt;/b&gt;</description>
<wire layer="21" width="0.127" x1="-5.207" x2="-5.207" y1="-1.27" y2="7.3406"/>
<wire layer="21" width="0.127" x1="-3.5052" x2="-3.5052" y1="7.3406" y2="8.8138"/>
<wire layer="21" width="0.127" x1="-3.5052" x2="-5.207" y1="8.8138" y2="8.8138"/>
<wire layer="21" width="0.127" x1="5.207" x2="3.5052" y1="8.8138" y2="8.8138"/>
<wire layer="21" width="0.127" x1="3.5052" x2="3.5052" y1="8.8138" y2="7.3406"/>
<wire layer="21" width="0.127" x1="5.2578" x2="5.2578" y1="-1.27" y2="7.3406"/>
<wire layer="21" width="0.127" x1="-5.207" x2="-3.5052" y1="7.3406" y2="7.3406"/>
<wire layer="21" width="0.127" x1="3.8354" x2="3.8354" y1="-1.27" y2="7.3406"/>
<wire layer="21" width="0.127" x1="-5.207" x2="3.8354" y1="-1.27" y2="-1.27"/>
<wire layer="21" width="0.127" x1="5.207" x2="5.207" y1="21.717" y2="8.8138"/>
<wire layer="21" width="0.127" x1="5.207" x2="-5.207" y1="21.717" y2="21.717"/>
<wire layer="21" width="0.127" x1="-5.207" x2="-5.207" y1="21.717" y2="8.8138"/>
<wire layer="21" width="0.127" x1="-3.5052" x2="3.5052" y1="7.3406" y2="7.3406"/>
<wire layer="21" width="0.127" x1="3.8354" x2="5.2578" y1="-1.27" y2="-1.27"/>
<wire layer="21" width="0.127" x1="3.8354" x2="5.2578" y1="7.3406" y2="7.3406"/>
<wire layer="21" width="0.127" x1="3.5052" x2="3.8354" y1="7.3406" y2="7.3406"/>
<wire layer="21" width="0.0508" x1="-4.953" x2="4.953" y1="-1.016" y2="-1.016"/>
<wire layer="21" width="0.0508" x1="4.953" x2="4.953" y1="7.112" y2="-1.016"/>
<wire layer="21" width="0.0508" x1="4.953" x2="-4.953" y1="7.112" y2="7.112"/>
<wire layer="21" width="0.0508" x1="-4.953" x2="-4.953" y1="-1.016" y2="7.112"/>
<text layer="25" ratio="10" size="1.27" x="-2.54" y="4.318">&gt;NAME</text>
<text layer="27" ratio="10" size="1.27" x="-4.445" y="2.159">&gt;VALUE</text>
<text layer="21" ratio="10" size="1.27" x="-2.54" y="-0.635">1</text>
<text layer="21" ratio="10" size="1.27" x="-0.635" y="-0.635">2</text>
<text layer="21" ratio="10" size="1.27" x="1.905" y="-0.635">3</text>
<circle layer="21" radius="0.4318" width="0.0" x="-3.7592" y="-0.2286"/>
<circle layer="21" radius="1.651" width="0.127" x="0.0" y="17.78"/>
<circle layer="42" radius="4.191" width="0.0" x="0.0" y="17.78"/>
<circle layer="43" radius="4.191" width="0.0" x="0.0" y="17.78"/>
<rectangle layer="21" x1="-0.635" x2="0.635" y1="-2.54" y2="-1.27"/>
<rectangle layer="21" x1="1.905" x2="3.175" y1="-2.54" y2="-1.27"/>
<rectangle layer="21" x1="-3.175" x2="-1.905" y1="-2.54" y2="-1.27"/>
<rectangle layer="21" x1="2.159" x2="2.921" y1="-3.429" y2="-2.54"/>
<rectangle layer="51" x1="2.159" x2="2.921" y1="-5.08" y2="-3.429"/>
<rectangle layer="21" x1="-0.381" x2="0.381" y1="-3.429" y2="-2.54"/>
<rectangle layer="21" x1="-2.921" x2="-2.159" y1="-3.429" y2="-2.54"/>
<rectangle layer="51" x1="-0.381" x2="0.381" y1="-5.08" y2="-3.429"/>
<rectangle layer="51" x1="-2.921" x2="-2.159" y1="-5.08" y2="-3.429"/>
<hole drill="3.302" x="0.0" y="17.78"/>
<pad drill="1.1176" name="1" rot="R90" shape="long" x="-2.54" y="-5.08"/>
<pad drill="1.1176" name="2" rot="R90" shape="long" x="0.0" y="-5.08"/>
<pad drill="1.1176" name="3" rot="R90" shape="long" x="2.54" y="-5.08"/>
</package>
</packages>
<symbols>
<symbol name="IGFET-EP-GDS">
<wire layer="94" width="0.1524" x1="-2.54" x2="-1.2192" y1="-2.54" y2="-2.54"/>
<wire layer="94" width="0.254" x1="0.0" x2="0.0" y1="0.762" y2="0.0"/>
<wire layer="94" width="0.254" x1="0.0" x2="0.0" y1="0.0" y2="-0.762"/>
<wire layer="94" width="0.254" x1="0.0" x2="0.0" y1="3.683" y2="1.397"/>
<wire layer="94" width="0.254" x1="0.635" x2="1.905" y1="0.635" y2="0.0"/>
<wire layer="94" width="0.254" x1="0.635" x2="1.905" y1="-0.635" y2="0.0"/>
<wire layer="94" width="0.1524" x1="0.0" x2="1.905" y1="0.0" y2="0.0"/>
<wire layer="94" width="0.1524" x1="1.905" x2="2.54" y1="0.0" y2="0.0"/>
<wire layer="94" width="0.1524" x1="2.54" x2="2.54" y1="0.0" y2="-2.54"/>
<wire layer="94" width="0.254" x1="0.0" x2="0.0" y1="-1.397" y2="-3.683"/>
<wire layer="94" width="0.254" x1="-1.143" x2="-1.143" y1="2.54" y2="-2.54"/>
<text layer="96" size="1.778" x="-11.43" y="0.0">&gt;VALUE</text>
<text layer="95" size="1.778" x="-11.43" y="2.54">&gt;NAME</text>
<pin direction="pas" length="middle" name="D" rot="R180" visible="off" x="5.08" y="2.54"/>
<pin direction="pas" length="middle" name="S" rot="R180" visible="off" x="5.08" y="-2.54"/>
<pin direction="pas" length="short" name="G" visible="off" x="-5.08" y="-2.54"/>
</symbol>
<symbol name="IGFET-EN-GDS">
<wire layer="94" width="0.1524" x1="-2.54" x2="-1.2192" y1="-2.54" y2="-2.54"/>
<wire layer="94" width="0.254" x1="0.0" x2="0.0" y1="0.762" y2="0.0"/>
<wire layer="94" width="0.254" x1="0.0" x2="0.0" y1="0.0" y2="-0.762"/>
<wire layer="94" width="0.254" x1="0.0" x2="0.0" y1="3.683" y2="1.397"/>
<wire layer="94" width="0.254" x1="1.905" x2="0.635" y1="0.635" y2="0.0"/>
<wire layer="94" width="0.254" x1="1.905" x2="0.635" y1="-0.635" y2="0.0"/>
<wire layer="94" width="0.1524" x1="0.0" x2="0.635" y1="0.0" y2="0.0"/>
<wire layer="94" width="0.1524" x1="0.635" x2="2.54" y1="0.0" y2="0.0"/>
<wire layer="94" width="0.1524" x1="2.54" x2="2.54" y1="0.0" y2="-2.54"/>
<wire layer="94" width="0.254" x1="0.0" x2="0.0" y1="-1.397" y2="-3.683"/>
<wire layer="94" width="0.254" x1="-1.143" x2="-1.143" y1="2.54" y2="-2.54"/>
<text layer="96" size="1.778" x="-11.43" y="0.0">&gt;VALUE</text>
<text layer="95" size="1.778" x="-11.43" y="2.54">&gt;NAME</text>
<pin direction="pas" length="middle" name="D" rot="R180" visible="off" x="5.08" y="2.54"/>
<pin direction="pas" length="middle" name="S" rot="R180" visible="off" x="5.08" y="-2.54"/>
<pin direction="pas" length="short" name="G" visible="off" x="-5.08" y="-2.54"/>
</symbol>
</symbols>
<devicesets>
<deviceset name="BSS92" prefix="Q">
<description>&lt;b&gt;P-Channel Enhancement MOSFET&lt;/b&gt; -200V; -0,15A; 11Ohm</description>
<gates>
<gate name="G$1" symbol="IGFET-EP-GDS" x="0.0" y="0.0"/>
</gates>
<devices>
<device name="" package="TO92">
<connects>
<connect gate="G$1" pad="2" pin="D"/>
<connect gate="G$1" pad="1" pin="G"/>
<connect gate="G$1" pad="3" pin="S"/>
</connects>
<technologies>
<technology name=""/>
</technologies>
</device>
</devices>
</deviceset>
<deviceset name="BSS97" prefix="Q">
<description>&lt;b&gt;N-Channel Enhancement MOSFET&lt;/b&gt; 200V; 1.5A; 1,6Ohm</description>
<gates>
<gate name="G$1" symbol="IGFET-EN-GDS" x="0.0" y="0.0"/>
</gates>
<devices>
<device name="" package="TO202">
<connects>
<connect gate="G$1" pad="2" pin="D"/>
<connect gate="G$1" pad="3" pin="G"/>
<connect gate="G$1" pad="1" pin="S"/>
</connects>
<technologies>
<technology name=""/>
</technologies>
</device>
</devices>
</deviceset>
</devicesets>
</library>
<library name="supply1">
<description>&lt;b&gt;Supply Symbols&lt;/b&gt;&lt;p&gt;
 GND, VCC, 0V, +5V, -5V, etc.&lt;p&gt;
 Please keep in mind, that these devices are necessary for the
 automatic wiring of the supply signals.&lt;p&gt;
 The pin name defined in the symbol is identical to the net which is to be wired automatically.&lt;p&gt;
 In this library the device names are the same as the pin names of the symbols, therefore the correct signal names appear next to the supply symbols in the schematic.&lt;p&gt;
 &lt;author&gt;Created by librarian@cadsoft.de&lt;/author&gt;</description>
<packages/>
<symbols>
<symbol name="GND">
<wire layer="94" width="0.254" x1="-1.905" x2="1.905" y1="0.0" y2="0.0"/>
<text layer="96" size="1.778" x="-2.54" y="-2.54">&gt;VALUE</text>
<pin direction="sup" length="short" name="GND" rot="R270" visible="off" x="0.0" y="2.54"/>
</symbol>
<symbol name="VDD">
<wire layer="94" width="0.254" x1="1.27" x2="0.0" y1="-1.905" y2="0.0"/>
<wire layer="94" width="0.254" x1="0.0" x2="-1.27" y1="0.0" y2="-1.905"/>
<wire layer="94" width="0.254" x1="0.0" x2="-1.27" y1="1.27" y2="-1.905"/>
<wire layer="94" width="0.254" x1="1.27" x2="0.0" y1="-1.905" y2="1.27"/>
<text layer="96" rot="R90" size="1.778" x="-2.54" y="-2.54">&gt;VALUE</text>
<pin direction="sup" length="short" name="VDD" rot="R90" visible="off" x="0.0" y="-2.54"/>
</symbol>
</symbols>
<devicesets>
<deviceset name="GND" prefix="GND">
<description>&lt;b&gt;SUPPLY SYMBOL&lt;/b&gt;</description>
<gates>
<gate name="1" symbol="GND" x="0.0" y="0.0"/>
</gates>
<devices>
<device name="">
<technologies>
<technology name=""/>
</technologies>
</device>
</devices>
</deviceset>
<deviceset name="VDD" prefix="VDD">
<description>&lt;b&gt;SUPPLY SYMBOL&lt;/b&gt;</description>
<gates>
<gate name="G$1" symbol="VDD" x="0.0" y="0.0"/>
</gates>
<devices>
<device name="">
<technologies>
<technology name=""/>
</technologies>
</device>
</devices>
</deviceset>
</devicesets>
</library>
<library name="pinhead">
<description>&lt;b&gt;Pin Header Connectors&lt;/b&gt;&lt;p&gt;
&lt;author&gt;Created by librarian@cadsoft.de&lt;/author&gt;</description>
<packages>
<package name="1X01">
<description>&lt;b&gt;PIN HEADER&lt;/b&gt;</description>
<wire layer="21" width="0.1524" x1="-0.635" x2="0.635" y1="1.27" y2="1.27"/>
<wire layer="21" width="0.1524" x1="0.635" x2="1.27" y1="1.27" y2="0.635"/>
<wire layer="21" width="0.1524" x1="1.27" x2="1.27" y1="0.635" y2="-0.635"/>
<wire layer="21" width="0.1524" x1="1.27" x2="0.635" y1="-0.635" y2="-1.27"/>
<wire layer="21" width="0.1524" x1="-1.27" x2="-1.27" y1="0.635" y2="-0.635"/>
<wire layer="21" width="0.1524" x1="-0.635" x2="-1.27" y1="1.27" y2="0.635"/>
<wire layer="21" width="0.1524" x1="-1.27" x2="-0.635" y1="-0.635" y2="-1.27"/>
<wire layer="21" width="0.1524" x1="0.635" x2="-0.635" y1="-1.27" y2="-1.27"/>
<text layer="25" ratio="10" size="1.27" x="-1.3462" y="1.8288">&gt;NAME</text>
<text layer="27" size="1.27" x="-1.27" y="-3.175">&gt;VALUE</text>
<rectangle layer="51" x1="-0.254" x2="0.254" y1="-0.254" y2="0.254"/>
<pad drill="1.016" name="1" shape="octagon" x="0.0" y="0.0"/>
</package>
</packages>
<symbols>
<symbol name="PINHD1">
<wire layer="94" width="0.4064" x1="-6.35" x2="1.27" y1="-2.54" y2="-2.54"/>
<wire layer="94" width="0.4064" x1="1.27" x2="1.27" y1="-2.54" y2="2.54"/>
<wire layer="94" width="0.4064" x1="1.27" x2="-6.35" y1="2.54" y2="2.54"/>
<wire layer="94" width="0.4064" x1="-6.35" x2="-6.35" y1="2.54" y2="-2.54"/>
<text layer="95" size="1.778" x="-6.35" y="3.175">&gt;NAME</text>
<text layer="96" size="1.778" x="-6.35" y="-5.08">&gt;VALUE</text>
<pin direction="pas" function="dot" length="short" name="1" visible="pad" x="-2.54" y="0.0"/>
</symbol>
</symbols>
<devicesets>
<deviceset name="PINHD-1X1" prefix="JP" uservalue="yes">
<description>&lt;b&gt;PIN HEADER&lt;/b&gt;</description>
<gates>
<gate name="G$1" symbol="PINHD1" x="0.0" y="0.0"/>
</gates>
<devices>
<device name="" package="1X01">
<connects>
<connect gate="G$1" pad="1" pin="1"/>
</connects>
<technologies>
<technology name=""/>
</technologies>
</device>
</devices>
</deviceset>
</devicesets>
</library>
</libraries>
<attributes/>
<variantdefs/>
<classes>
<class name="default" number="0"/>
</classes>
<parts>
<part device="" deviceset="BSS92" library="transistor-fet" name="Q1">
<attribute name="P1" value="0001"/>
<attribute name="TEST2" value="5"/>
<attribute name="UID" value="8"/>
</part>
<part device="" deviceset="BSS92" library="transistor-fet" name="Q2">
<attribute name="P2" value="0002"/>
<attribute name="UID" value="-1"/>
</part>
<part device="" deviceset="BSS97" library="transistor-fet" name="Q3">
<attribute name="UID" value="-1"/>
</part>
<part device="" deviceset="BSS97" library="transistor-fet" name="Q4">
<attribute name="UID" value="-1"/>
</part>
<part device="" deviceset="GND" library="supply1" name="GND1">
<attribute name="UID" value="-1"/>
</part>
<part device="" deviceset="VDD" library="supply1" name="VDD1">
<attribute name="UID" value="-1"/>
</part>
<part device="" deviceset="PINHD-1X1" library="pinhead" name="NAND(A,B)">
<attribute name="UID" value="-1"/>
</part>
<part device="" deviceset="PINHD-1X1" library="pinhead" name="A">
<attribute name="UID" value="-1"/>
</part>
<part device="" deviceset="PINHD-1X1" library="pinhead" name="B">
<attribute name="UID" value="-1"/>
</part>
</parts>
<sheets>
<sheet>
<plain>
<text layer="91" size="1.778" x="-231.14" y="167.64">testtesttest</text>
</plain>
<instances>
<instance gate="G$1" part="Q1" x="-182.88" y="172.72">
<attribute display="value" layer="96" name="P1" size="1.778" x="-182.88" y="172.72"/>
<attribute display="value" layer="96" name="TEST2" size="1.778" x="-182.88" y="172.72"/>
<attribute layer="96" name="UID" value="8"/>
</instance>
<instance gate="G$1" part="Q2" x="-165.1" y="172.72">
<attribute display="value" layer="96" name="P2" size="1.778" x="-165.1" y="172.72"/>
<attribute layer="96" name="UID" value="-1"/>
</instance>
<instance gate="G$1" part="Q3" x="-165.1" y="121.92">
<attribute layer="96" name="UID" value="-1"/>
</instance>
<instance gate="G$1" part="Q4" x="-165.1" y="139.7">
<attribute layer="96" name="UID" value="-1"/>
</instance>
<instance gate="1" part="GND1" x="-160.02" y="109.22">
<attribute layer="96" name="UID" value="-1"/>
</instance>
<instance gate="G$1" part="VDD1" x="-177.8" y="193.04">
<attribute layer="96" name="UID" value="-1"/>
</instance>
<instance gate="G$1" part="NAND(A,B)" x="-142.24" y="165.1">
<attribute layer="96" name="UID" value="-1"/>
</instance>
<instance gate="G$1" part="A" rot="R180" x="-215.9" y="137.16">
<attribute layer="96" name="UID" value="-1"/>
</instance>
<instance gate="G$1" part="B" rot="R180" x="-215.9" y="119.38">
<attribute layer="96" name="UID" value="-1"/>
</instance>
</instances>
<busses/>
<nets>
<net class="0" name="NAND(A,B)">
<segment>
<pinref gate="G$1" part="Q1" pin="S"/>
<pinref gate="G$1" part="Q2" pin="S"/>
<pinref gate="G$1" part="Q4" pin="D"/>
<pinref gate="G$1" part="NAND(A,B)" pin="1"/>
<wire layer="91" width="0.1524" x1="-177.8" x2="-177.8" y1="170.18" y2="165.1"/>
<wire layer="91" width="0.1524" x1="-177.8" x2="-160.02" y1="165.1" y2="165.1"/>
<wire layer="91" width="0.1524" x1="-160.02" x2="-144.78" y1="165.1" y2="165.1"/>
<wire layer="91" width="0.1524" x1="-160.02" x2="-160.02" y1="170.18" y2="165.1"/>
<wire layer="91" width="0.1524" x1="-160.02" x2="-160.02" y1="142.24" y2="165.1"/>
<junction x="-160.02" y="165.1"/>
</segment>
</net>
<net class="0" name="N$2">
<segment>
<pinref gate="G$1" part="Q4" pin="S"/>
<pinref gate="G$1" part="Q3" pin="D"/>
<wire layer="91" width="0.1524" x1="-160.02" x2="-160.02" y1="137.16" y2="124.46"/>
</segment>
</net>
<net class="0" name="GND">
<segment>
<pinref gate="G$1" part="Q3" pin="S"/>
<pinref gate="1" part="GND1" pin="GND"/>
<wire layer="91" width="0.1524" x1="-160.02" x2="-160.02" y1="119.38" y2="111.76"/>
</segment>
</net>
<net class="0" name="ATEST">
<segment>
<pinref gate="G$1" part="Q4" pin="G"/>
<pinref gate="G$1" part="A" pin="1"/>
<pinref gate="G$1" part="Q2" pin="G"/>
<wire layer="91" width="0.1524" x1="-170.18" x2="-172.72" y1="137.16" y2="137.16"/>
<wire layer="91" width="0.1524" x1="-172.72" x2="-213.36" y1="137.16" y2="137.16"/>
<wire layer="91" width="0.1524" x1="-170.18" x2="-172.72" y1="170.18" y2="170.18"/>
<wire layer="91" width="0.1524" x1="-172.72" x2="-172.72" y1="170.18" y2="137.16"/>
<junction x="-172.72" y="137.16"/>
</segment>
</net>
<net class="0" name="B">
<segment>
<pinref gate="G$1" part="Q3" pin="G"/>
<pinref gate="G$1" part="B" pin="1"/>
<pinref gate="G$1" part="Q1" pin="G"/>
<wire layer="91" width="0.1524" x1="-170.18" x2="-203.2" y1="119.38" y2="119.38"/>
<wire layer="91" width="0.1524" x1="-203.2" x2="-213.36" y1="119.38" y2="119.38"/>
<wire layer="91" width="0.1524" x1="-187.96" x2="-203.2" y1="170.18" y2="170.18"/>
<wire layer="91" width="0.1524" x1="-203.2" x2="-203.2" y1="170.18" y2="119.38"/>
<junction x="-203.2" y="119.38"/>
</segment>
</net>
<net class="0" name="VDD">
<segment>
<pinref gate="G$1" part="Q1" pin="D"/>
<pinref gate="G$1" part="VDD1" pin="VDD"/>
<pinref gate="G$1" part="Q2" pin="D"/>
<wire layer="91" width="0.1524" x1="-177.8" x2="-177.8" y1="175.26" y2="185.42"/>
<wire layer="91" width="0.1524" x1="-177.8" x2="-177.8" y1="185.42" y2="190.5"/>
<wire layer="91" width="0.1524" x1="-177.8" x2="-160.02" y1="185.42" y2="185.42"/>
<wire layer="91" width="0.1524" x1="-160.02" x2="-160.02" y1="175.26" y2="185.42"/>
<junction x="-177.8" y="185.42"/>
</segment>
</net>
</nets>
</sheet>
</sheets>
</schematic>
</drawing>
</eagle>
