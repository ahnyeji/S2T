import QtQuick 2.12
import QtQuick.Window 2.12
import QtQuick.Controls 2.13


Window {
    property bool mbImageClicked : true
    property int mCount : 0
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
                    source: mbImageClicked? "images/microphone1.gif" : "images/mic1.gif"
                }

                onClicked: {
                    if(mbImageClicked){
                        stackview.push("qrc:/PageTest.qml")
                        mbImageClicked = false;

                    }else{
                        mbImageClicked = true;
                        stackview.pop("qrc:/PageTest.qml")


                    }
                }
            }
        }
        StackView{
            id: stackview
            x: 0
            y: 768
            width: parent.width
            height: parent.height*0.6


            initialItem: Column {
                id: mainbar
                width: parent.width
                height: parent.height

                Rectangle {
                    id: categorybar
                    width: parent.width
                    height: parent.height*0.08
                    color: "#da291c"

                    Row {
                        id: category
                        width: parent.width
                        height: parent.height*0.9
                        topPadding: 7
                        leftPadding: parent.width*0.02
                        rightPadding: parent.width*0.02


                        Button {
                            id: recommendBtn
                            highlighted: false
                            width: parent.width * 0.16
                            height: parent.height * 1.3

                            background: Rectangle {
                                id: rectangle
                                color: categoryClicked == 6 ? "#ffffff":"#da291c"
                                radius: 10

                                Text {
                                    id: recommend
                                    text: qsTr("추천")
                                    anchors.horizontalCenter: parent.horizontalCenter
                                    topPadding : 4.5
                                    verticalAlignment: Text.AlignVCenter
                                    horizontalAlignment: Text.AlignHCenter
                                    font.family: "Courier"
                                    font.letterSpacing: 2
                                    font.weight: Font.Bold
                                    font.pointSize: 14
                                    color: categoryClicked == 6 ? "#000000":"#ffffff"
                                }
                            }
                            onClicked: {
                                if(categoryClicked != 6){
                                    categoryClicked = 6
                                    pageSource = "PageRecommend.qml"
                                }
                            }
                        }

                        Button {
                            id: burgerBtn
                            highlighted: false
                            width: parent.width * 0.16
                            height: parent.height * 1.3

                            background: Rectangle {
                                id: rectangle2
                                color: categoryClicked == 1 ? "#ffffff":"#da291c"
                                radius: 10


                                Text {
                                    id: burger
                                    text: qsTr("버거")
                                    anchors.horizontalCenter: parent.horizontalCenter
                                    topPadding : 4.5
                                    verticalAlignment: Text.AlignVCenter
                                    horizontalAlignment: Text.AlignHCenter
                                    font.family: "Courier"
                                    font.letterSpacing: 2
                                    font.weight: Font.Bold
                                    font.pointSize: 14
                                    color: categoryClicked == 1 ? "#000000":"#ffffff"
                                }
                            }
                            onClicked: {
                                if(categoryClicked != 1){
                                    categoryClicked = 1
                                    pageSource = "PageBurger.qml"
                                }
                            }
                        }

                        Button {
                            id: setBtn
                            width: parent.width * 0.16
                            height: parent.height * 1.3
                            highlighted: false
                            background: Rectangle {
                                id: rectangle1
                                color: categoryClicked == 2 ? "#ffffff":"#da291c"
                                radius: 10
                                Text {
                                    id: set
                                    color: categoryClicked == 2 ? "#000000":"#ffffff"
                                    text: qsTr("세트/팩")
                                    anchors.horizontalCenter: parent.horizontalCenter
                                    topPadding : 4.5
                                    verticalAlignment: Text.AlignVCenter
                                    horizontalAlignment: Text.AlignHCenter
                                    font.pointSize: 14
                                    font.weight: Font.Bold
                                    font.family: "Courier"
                                    font.letterSpacing: 2
                                }
                            }
                            onClicked: {
                                if(categoryClicked != 2){
                                    categoryClicked = 2
                                    pageSource = "PageSet.qml"
                                }
                            }

                        }

                        Button {
                            id: dessertBtn
                            width: parent.width * 0.16
                            height: parent.height * 1.3
                            highlighted: false
                            background: Rectangle {
                                id: rectangle3
                                color: categoryClicked == 3 ? "#ffffff":"#da291c"
                                radius: 10
                                Text {
                                    id: dessert
                                    color: categoryClicked == 3 ? "#000000":"#ffffff"
                                    text: qsTr("디저트")
                                    anchors.horizontalCenter: parent.horizontalCenter
                                    topPadding : 4.5
                                    verticalAlignment: Text.AlignVCenter
                                    horizontalAlignment: Text.AlignHCenter
                                    font.pointSize: 14
                                    font.weight: Font.Bold
                                    font.family: "Courier"
                                    font.letterSpacing: 2
                                }
                            }
                            onClicked: {
                                if(categoryClicked != 3){
                                    categoryClicked = 3
                                    pageSource = "PageDessert.qml"
                                }
                            }
                        }

                        Button {
                            id: drinkBtn
                            width: parent.width * 0.16
                            height: parent.height * 1.3
                            highlighted: false
                            background: Rectangle {
                                id: rectangle4
                                color: categoryClicked == 4 ? "#ffffff":"#da291c"
                                radius: 10
                                Text {
                                    id: drink
                                    color: categoryClicked == 4 ? "#000000":"#ffffff"
                                    text: qsTr("음료")
                                    anchors.horizontalCenter: parent.horizontalCenter
                                    topPadding : 4.5
                                    verticalAlignment: Text.AlignVCenter
                                    horizontalAlignment: Text.AlignHCenter
                                    font.pointSize: 14
                                    font.weight: Font.Bold
                                    font.family: "Courier"
                                    font.letterSpacing: 2
                                }
                            }
                            onClicked: {
                                if(categoryClicked != 4){
                                    categoryClicked = 4
                                    pageSource = "PageDrink.qml"
                                }
                            }
                        }

                        Button {
                            id: chickenBtn
                            width: parent.width * 0.16
                            height: parent.height * 1.3
                            highlighted: false
                            background: Rectangle {
                                id: rectangle5
                                color: categoryClicked == 5 ? "#ffffff":"#da291c"
                                radius: 10
                                Text {
                                    id: chicken
                                    color: categoryClicked == 5 ? "#000000":"#ffffff"
                                    text: qsTr("치킨")
                                    anchors.horizontalCenter: parent.horizontalCenter
                                    topPadding : 4.5
                                    verticalAlignment: Text.AlignVCenter
                                    horizontalAlignment: Text.AlignHCenter
                                    font.pointSize: 14
                                    font.weight: Font.Bold
                                    font.family: "Courier"
                                    font.letterSpacing: 2
                                }
                            }
                            onClicked: {
                                if(categoryClicked != 5){
                                    categoryClicked = 5
                                    pageSource = "PageChicken.qml"
                                }
                            }
                        }
                    }
                }

                Row {
                    id: mainView
                    width: parent.width
                    height: parent.height*0.92

                    Loader {
                        id: pageLoader

                        source: pageSource
                        anchors.fill:parent
                    }
                }

            }

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




/*##^##
        Designer {
            D{i:49;anchors_width:16.2}
        }
        ##^##*/
