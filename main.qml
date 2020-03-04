import QtQuick 2.12
import QtQuick.Window 2.12
import QtQuick.Controls 2.13


Window {
    property bool micUnclicked : true
    property int categoryClicked: 6
    property url pageSource : "PageBurger.qml"
    property string manuName

    visible: true
    width: 432
    height: 768
    title: qsTr("LotteRia Kiosk")

    Column {

        id: entire
        width: parent.width
        height: parent.height

        Rectangle {
            id: logobar
            width: parent.width
            height: parent.height*0.033
            color: "#da291c"

            Image {
                id: logo
                width: parent.width * 0.3
                height: parent.height
                source: "images/logo.png"
                fillMode: Image.PreserveAspectFit
            }
        }

        Row {
            id: stt
            width: parent.width
            height: parent.height*0.137

            Text {
                id: guide
                text: qsTr("마이크 버튼을 누른 후 천천히 말씀 해 주세요.")
                verticalAlignment: Text.AlignVCenter
                horizontalAlignment: Text.AlignHCenter
                font.bold: true
                width: parent.width * 0.75
                height: parent.height
                font.pixelSize: 15
            }


            Button {
                id: mic
                text: qsTr("")
                width: parent.width * 0.25
                height: parent.height
                background: AnimatedImage
                {
                    width: parent.width
                    height : parent.height
                    fillMode: Image.PreserveAspectFit
                    source: micUnclicked? "images/microphone1.gif" : "images/mic1.gif"
                }

                onClicked: {
                    if(micUnclicked){
                        stackview.push("qrc:/PageTest.qml")
                        micUnclicked = false;

                    }else{
                        micUnclicked = true;
                        stackview.pop("qrc:/PageTest.qml")


                    }
                }
            }
        }
        StackView{
            id: stackview
            width: parent.width
            height: parent.height*0.6
            replaceEnter: Transition {
                PropertyAnimation {//뷰를 replace 한 화면이 그려질때 출력하는 애니메이션
                    property: "opacity"
                    from: 1
                    to:1
                    duration: 0
                 }
            }
            replaceExit: Transition {
                PropertyAnimation {//뷰를 replace 한 화면이 그려질때 이전화면이 없어지는 애니메이션
                    property: "opacity"
                    from: 1
                    to:1
                    duration: 0
                }
            }
            pushEnter: Transition {
                PropertyAnimation {//뷰를 push 한 화면이 그려지는 애니메이션
                    property: "opacity"//투명도가 설정 되게 설정 x,나 y등 다른 속성값으로 설정할수 있음
                    from: 1//투명도를 1에서 1로 바꿔줌 즉 투명도가 변하지 않아서 애니메이션이 없는 것처럼 된다.
                    to:1
                    duration: 0
                }
            }
            pushExit: Transition {
                PropertyAnimation {//뷰를 push 한 화면이 그려질때 이전화면이 없어지는 애니메이션
                    property: "opacity"//투명도가 설정 되게 설정 x,나 y등 다른 속성값으로 설정할수 있음
                    from: 1
                    to:1//투명도를 1에서 1로 바꿔줌 즉 투명도가 변하지 않아서 애니메이션이 없는 것처럼 된다.
                    duration: 0
                }
            }
            popEnter: Transition {
                PropertyAnimation {////뷰를 pop해서 이전화면으로 갈때 이전화면이 출력되는 애니메이션
                    property: "opacity"//투명도가 설정 되게 설정 x,나 y등 다른 속성값으로 설정할수 있음
                    from: 1//투명도를 1에서 1로 바꿔줌 즉 투명도가 변하지 않아서 애니메이션이 없는 것처럼 된다.
                    to:1
                    duration: 0
                }
            }
            popExit: Transition {
                PropertyAnimation {//뷰를 pop 했을때 pop한 화면이 없어지는 애니메이션
                    property: "opacity"//투명도가 설정 되게 설정 x,나 y등 다른 속성값으로 설정할수 있음
                    from: 1
                    to:1//투명도를 1에서 1로 바꿔줌 즉 투명도가 변하지 않아서 애니메이션이 없는 것처럼 된다.
                    duration:0
                }
            }

            initialItem: "qrc:/Mainbar.qml"
        }

        Row {
            id: order
            width: parent.width
            height: parent.height*0.23

            Item {
                id: orderItem
                width: parent.width*0.76
                height: parent.height


                ListView {
                    width: parent.width
                    height: parent.height*0.8
                    anchors.bottom: parent.bottom
                    anchors.bottomMargin: 0
                    highlightRangeMode: ListView.ApplyRange

                    model: ListModel{
                        id: listModel
                        //                                ListElement {
                        //                                    name: "불고기버거"
                        //                                    number: "1"
                        //                                    won: "2,500"
                        //                                }
                        //                                ListElement {
                        //                                    name: "치킨버거"
                        //                                    number: "2"
                        //                                    won: "2,500"
                        //                                }

                    }

                    delegate: Component {

                        Item {
                            width: parent.width
                            height: 27

                            Row {
                                id: row1
                                width: parent.width
                                height: parent.height
                                Text {
                                    width: parent.width*0.5
                                    height: parent.height
                                    text: name
                                    anchors.verticalCenter: parent.verticalCenter
                                    verticalAlignment: Text.AlignVCenter
                                    horizontalAlignment: Text.AlignHCenter
                                }

                                SpinBox{
                                    id: sb
                                    background: Rectangle{
                                        color: "#ffffff"
                                    }

                                    width: parent.width*0.22
                                    height: parent.height
                                    anchors.verticalCenter: parent.verticalCenter
                                    font.pointSize: 13
                                    value: number

                                    up.indicator: Rectangle {
                                        height: parent.height*0.5
                                        width: this.height
                                        anchors.right: parent.right
                                        anchors.rightMargin: 10
                                        color: sb.up.pressed ? "#e4e4e4" : "#f6f6f6"
                                        anchors.verticalCenter: parent.verticalCenter
                                        border.color: "#e4e4e4"
                                        Text {
                                            text: '+'
                                            anchors.centerIn: parent
                                            font.pointSize: 12
                                        }
                                    }
                                    down.indicator: Rectangle {
                                        height: parent.height*0.5
                                        width: this.height
                                        anchors.left: parent.left
                                        anchors.leftMargin: 10
                                        color: sb.down.pressed ? "#e4e4e4" : "#f6f6f6"
                                        anchors.verticalCenter: parent.verticalCenter
                                        border.color: "#e4e4e4"
                                        Text {
                                            text: '-'
                                            anchors.centerIn: parent
                                            font.pointSize: 12
                                        }
                                    }

                                }

                                Text {
                                    text: won
                                    anchors.verticalCenter: parent.verticalCenter
                                    verticalAlignment: Text.AlignVCenter
                                    horizontalAlignment: Text.AlignHCenter
                                    leftPadding: 20
                                    rightPadding: 15
                                    font.pointSize: 13
                                }
                                RoundButton{
                                    height: parent.height*0.5
                                    width: this.height
                                    text: "x"
                                    anchors.verticalCenter: parent.verticalCenter

                                    font.pointSize: 12
                                    onClicked: {
                                        listModel.remove(index)
                                    }
                                }

                            }
                        }
                    }

                    ScrollBar.vertical: ScrollBar{
                        width:8
                        policy:ScrollBar.AsNeeded
                    }

                    ScrollIndicator.vertical: ScrollIndicator { }
                }


                Row {
                    id: row
                    width: parent.width
                    height: parent.height*0.18

                    Rectangle{
                        id: rectangle6
                        width: parent.width*0.5
                        height: parent.height
                        color: "#eaeaea"
                        opacity: 1
                        Text {
                            id: element2
                            text: qsTr("주문 목록")
                            anchors.verticalCenter: parent.verticalCenter
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 15
                        }
                    }
                    Rectangle{
                        id: rectangle7
                        width: parent.width*0.2
                        height: parent.height
                        color: "#eaeaea"
                        opacity: 1
                        Text {
                            id: element22
                            text: qsTr("수량")
                            anchors.verticalCenter: parent.verticalCenter
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 15
                        }
                    }
                    Rectangle{
                        id: rectangle8
                        width: parent.width*0.3
                        height: parent.height
                        color: "#eaeaea"
                        opacity: 1
                        Text {
                            id: element233
                            text: qsTr("금액")
                            anchors.verticalCenter: parent.verticalCenter
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 15
                        }
                    }
                }
            }

            Column {
                id: column1
                width: parent.width*0.24
                height: parent.height
                leftPadding: column1.width*0.1
                topPadding: column1.height*0.05

                Text {
                    id: element
                    width: parent.width*0.6
                    text: qsTr("총 주문 금액")
                    font.pixelSize: 13
                }

                Row {
                    id: row2
                    width: parent.width*0.8
                    height: parent.height*0.25

                    Text {
                        id: element11
                        width: parent.width*0.8
                        height: parent.height
                        text: qsTr("10000")
                        horizontalAlignment: Text.AlignHCenter
                        verticalAlignment: Text.AlignVCenter
                        font.bold: true
                        font.pixelSize: 20
                    }

                    Text {
                        id: element1
                        width: parent.width*0.2
                        height: parent.height
                        color: "#da291c"
                        text: qsTr("원")
                        verticalAlignment: Text.AlignVCenter
                        font.bold: true
                        font.pixelSize: 20
                    }
                }

                Rectangle {
                    id: blank
                    width: parent.width
                    height: parent.height*0.05
                    color: "#ffffff"
                }

                Button {
                    id: button
                    width: parent.width*0.8
                    height: parent.height*0.5

                    background: Rectangle{
                        color: "#da291c"
                        radius: 10
                    }

                    Text {
                        id: element17
                        text: qsTr("주문하기")
                        anchors.verticalCenter: parent.verticalCenter
                        anchors.horizontalCenter: parent.horizontalCenter
                        font.bold: true
                        font.pixelSize: 20
                        color: "#ffffff"
                    }
                }




            }
        }


    }


}
