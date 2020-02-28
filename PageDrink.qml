import QtQuick 2.12
import QtQuick.Controls 2.5

Page{
    header: Label {
        text: qsTr("")
        padding: 0
        height: 0
    }

    SwipeView {

        id: swipeView
        width: parent.width
        height: parent.height * 0.95
        currentIndex: indicator.currentIndex


        Item {
            id: drinkPage1

            Grid {
                id: drinkGrid1
                x: 0
                y: 0
                width: parent.width * 0.85
                height: parent.height * 0.85
                anchors.horizontalCenter: parent.horizontalCenter
                anchors.verticalCenter: parent.verticalCenter
                spacing: 1
                rows: 3
                columns: 3

                Button {
                    id: button1
                    text: qsTr("")
                    width: parent.width * 0.33
                    height: parent.height * 0.33
                    background: Rectangle{
                        color : "white"
                    }

                    Column {
                        id: column1
                        x: 0
                        y: 0
                        width: parent.width
                        height: parent.height

                        Image {
                            id: image1
                            width: parent.width * 0.9
                            height: parent.height * 0.5
                            anchors.horizontalCenter: parent.horizontalCenter
                            source: "images/menu/drink/IcedTea.jpg"
                            fillMode: Image.PreserveAspectFit
                        }

                        Text {
                            id: name1
                            text: qsTr("아이스티")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price1
                            text: qsTr("2,200")
                            topPadding: 3
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }
                    }
                }

                Button {
                    id: button2
                    text: qsTr("")
                    width: parent.width * 0.33
                    height: parent.height * 0.33
                    background: Rectangle{
                        color : "white"
                    }

                    Column {
                        id: column2
                        x: 0
                        y: 0
                        width: parent.width
                        height: parent.height

                        Image {
                            id: image2
                            width: parent.width * 0.9
                            height: parent.height * 0.5
                            anchors.horizontalCenter: parent.horizontalCenter
                            source: "images/menu/drink/IceAmericanoL.jpg"
                            fillMode: Image.PreserveAspectFit
                        }

                        Text {
                            id: name2
                            text: qsTr("아이스 아메리카노(L)")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price2
                            text: qsTr("2,500")
                            topPadding: 3
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }
                    }
                }

                Button {
                    id: button3
                    text: qsTr("")
                    width: parent.width * 0.33
                    height: parent.height * 0.33
                    background: Rectangle{
                        color : "white"
                    }

                    Column {
                        id: column3
                        x: 0
                        y: 0
                        width: parent.width
                        height: parent.height

                        Image {
                            id: image3
                            width: parent.width * 0.9
                            height: parent.height * 0.5
                            anchors.horizontalCenter: parent.horizontalCenter
                            source: "images/menu/drink/HotChoco.png"
                            fillMode: Image.PreserveAspectFit
                        }

                        Text {
                            id: name3
                            text: qsTr("핫초코")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price3
                            text: qsTr("2,000")
                            topPadding: 3
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }
                    }
                }

                Button {
                    id: button4
                    text: qsTr("")
                    width: parent.width * 0.33
                    height: parent.height * 0.33
                    background: Rectangle{
                        color : "white"
                    }

                    Column {
                        id: column4
                        x: 0
                        y: 0
                        width: parent.width
                        height: parent.height

                        Image {
                            id: image4
                            width: parent.width * 0.9
                            height: parent.height * 0.5
                            anchors.horizontalCenter: parent.horizontalCenter
                            source: "images/menu/drink/OrangeJuice.jpg"
                            fillMode: Image.PreserveAspectFit
                        }

                        Text {
                            id: name4
                            text: qsTr("오렌지주스")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price4
                            text: qsTr("2,500")
                            topPadding: 3
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }
                    }
                }

                Button {
                    id: button5
                    text: qsTr("")
                    width: parent.width * 0.33
                    height: parent.height * 0.33
                    background: Rectangle{
                        color : "white"
                    }

                    Column {
                        id: column5
                        x: 0
                        y: 0
                        width: parent.width
                        height: parent.height

                        Image {
                            id: image5
                            width: parent.width * 0.9
                            height: parent.height * 0.5
                            anchors.horizontalCenter: parent.horizontalCenter
                            source: "images/menu/drink/Milk.jpg"
                            fillMode: Image.PreserveAspectFit
                        }

                        Text {
                            id: name5
                            text: qsTr("우유")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price5
                            text: qsTr("1,500")
                            topPadding: 3
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }
                    }
                }

                Button {
                    id: button6
                    text: qsTr("")
                    width: parent.width * 0.33
                    height: parent.height * 0.33
                    background: Rectangle{
                        color : "white"
                    }

                    Column {
                        id: column6
                        x: 0
                        y: 0
                        width: parent.width
                        height: parent.height

                        Image {
                            id: image6
                            width: parent.width * 0.9
                            height: parent.height * 0.5
                            anchors.horizontalCenter: parent.horizontalCenter
                            source: "images/menu/drink/CiderR.jpg"
                            fillMode: Image.PreserveAspectFit
                        }

                        Text {
                            id: name6
                            text: qsTr("사이다(R)")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price6
                            text: qsTr("1,700")
                            topPadding: 3
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }
                    }
                }

                Button {
                    id: button7
                    text: qsTr("")
                    width: parent.width * 0.33
                    height: parent.height * 0.33
                    background: Rectangle{
                        color : "white"
                    }

                    Column {
                        id: column7
                        x: 0
                        y: 0
                        width: parent.width
                        height: parent.height

                        Image {
                            id: image7
                            width: parent.width * 0.9
                            height: parent.height * 0.5
                            anchors.horizontalCenter: parent.horizontalCenter
                            source: "images/menu/drink/ColaR.jpg"
                            fillMode: Image.PreserveAspectFit
                        }

                        Text {
                            id: name7
                            text: qsTr("콜라(R)")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price7
                            text: qsTr("1,700")
                            topPadding: 3
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }
                    }
                }

                Button {
                    id: button8
                    text: qsTr("")
                    width: parent.width * 0.33
                    height: parent.height * 0.33
                    background: Rectangle{
                        color : "white"
                    }

                    Column {
                        id: column8
                        x: 0
                        y: 0
                        width: parent.width
                        height: parent.height

                        Image {
                            id: image8
                            width: parent.width * 0.9
                            height: parent.height * 0.5
                            anchors.horizontalCenter: parent.horizontalCenter
                            source: "images/menu/drink/MilkShakeStrawberry.jpg"
                            fillMode: Image.PreserveAspectFit
                        }

                        Text {
                            id: name8
                            text: qsTr("밀크쉐이크(딸기)")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price8
                            text: qsTr("2,100")
                            topPadding: 3
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }
                    }
                }

                Button {
                    id: button9
                    text: qsTr("")
                    width: parent.width * 0.33
                    height: parent.height * 0.33
                    background: Rectangle{
                        color : "white"
                    }

                    Column {
                        id: column9
                        x: 0
                        y: 0
                        width: parent.width
                        height: parent.height

                        Image {
                            id: image9
                            width: parent.width * 0.9
                            height: parent.height * 0.5
                            anchors.horizontalCenter: parent.horizontalCenter
                            source: "images/menu/drink/MilkShakeChoco.jpg"
                            fillMode: Image.PreserveAspectFit
                        }

                        Text {
                            id: name9
                            text: qsTr("밀크쉐이크(초코)")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price9
                            text: qsTr("2,100")
                            topPadding: 3
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }
                    }
                }

            }

        }

        Item {
            id: drinkPage2
            x: -1
            y: 0
            Grid {
                id: drinkGrid2
                x: 0
                y: 0
                width: parent.width * 0.85
                height: parent.height * 0.85
                anchors.horizontalCenter: parent.horizontalCenter
                anchors.verticalCenter: parent.verticalCenter
                spacing: 1
                rows: 3
                columns: 3

                Button {
                    id: button10
                    width: parent.width * 0.33
                    height: parent.height * 0.33
                    text: qsTr("")
                    background: Rectangle {
                        color: "#ffffff"
                    }
                    Column {
                        id: column10
                        x: 0
                        y: 0
                        width: parent.width
                        height: parent.height
                        Image {
                            id: image10
                            width: parent.width * 0.9
                            height: parent.height * 0.5
                            source: "images/menu/drink/MilkShakeVanilla.jpg"
                            fillMode: Image.PreserveAspectFit
                            anchors.horizontalCenter: parent.horizontalCenter
                        }

                        Text {
                            id: name10
                            text: qsTr("밀크쉐이크(바닐라)")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price10
                            text: qsTr("2,100")
                            topPadding: 3
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }
                    }
                }

                Button {
                    id: button11
                    width: parent.width * 0.33
                    height: parent.height * 0.33
                    text: qsTr("")
                    background: Rectangle {
                        color: "#ffffff"
                    }
                    Column {
                        id: column11
                        x: 0
                        y: 0
                        width: parent.width
                        height: parent.height
                        Image {
                            id: image11
                            width: parent.width * 0.9
                            height: parent.height * 0.5
                            source: "images/menu/drink/Americano.jpg"
                            fillMode: Image.PreserveAspectFit
                            anchors.horizontalCenter: parent.horizontalCenter
                        }

                        Text {
                            id: name11
                            text: qsTr("아메리카노")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price11
                            text: qsTr("2,000")
                            topPadding: 3
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }
                    }
                }

                Button {
                    id: button12
                    width: parent.width * 0.33
                    height: parent.height * 0.33
                    text: qsTr("")
                    background: Rectangle {
                        color: "#ffffff"
                    }
                    Column {
                        id: column12
                        x: 0
                        y: 0
                        width: parent.width
                        height: parent.height
                        Image {
                            id: image12
                            width: parent.width * 0.9
                            height: parent.height * 0.5
                            source: "images/menu/drink/IceAmericano.jpg"
                            fillMode: Image.PreserveAspectFit
                            anchors.horizontalCenter: parent.horizontalCenter
                        }

                        Text {
                            id: name12
                            text: qsTr("아이스 아메리카노")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price12
                            text: qsTr("2,000")
                            topPadding: 3
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }
                    }
                }

                Button {
                    id: button13
                    width: parent.width * 0.33
                    height: parent.height * 0.33
                    text: qsTr("")
                    background: Rectangle {
                        color: "#ffffff"
                    }
                    Column {
                        id: column13
                        x: 0
                        y: 0
                        width: parent.width
                        height: parent.height
                        Image {
                            id: image13
                            width: parent.width * 0.9
                            height: parent.height * 0.5
                            source: "images/menu/drink/CafeLatte.jpg"
                            fillMode: Image.PreserveAspectFit
                            anchors.horizontalCenter: parent.horizontalCenter
                        }

                        Text {
                            id: name13
                            text: qsTr("카페라떼")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price13
                            text: qsTr("2,400")
                            topPadding: 3
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }
                    }
                }

                Button {
                    id: button14
                    width: parent.width * 0.33
                    height: parent.height * 0.33
                    text: qsTr("")
                    background: Rectangle {
                        color: "#ffffff"
                    }
                    Column {
                        id: column14
                        x: 0
                        y: 0
                        width: parent.width
                        height: parent.height
                        Image {
                            id: image14
                            width: parent.width * 0.9
                            height: parent.height * 0.5
                            source: "images/menu/drink/IceCaffeLatte.jpg"
                            fillMode: Image.PreserveAspectFit
                            anchors.horizontalCenter: parent.horizontalCenter
                        }

                        Text {
                            id: name14
                            text: qsTr("아이스 카페라떼")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price14
                            text: qsTr("2,400")
                            topPadding: 3
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }
                    }
                }


            }

        }
    }

    Button
            {
                id:minus
                width: 30
                height: 81
                anchors.left:parent.left
                anchors.verticalCenter: parent.verticalCenter
                background : Image {
                    id: backimage
                    width: parent.width
                    height: parent.height
                    source: "images/back.png"
                }

                onClicked:{
                    if(swipeView.currentIndex>0)
                        swipeView.currentIndex--
                }
            }

    PageIndicator {
        id: indicator
        anchors.bottom: parent.bottom
        bottomPadding: 20
        count: swipeView.count
        currentIndex: swipeView.currentIndex
        anchors.horizontalCenter: parent.horizontalCenter
        }

        Button
            {
                id:plus
                width:30
                height:81
                anchors.right: parent.right
                anchors.rightMargin:0
                anchors.verticalCenter: parent.verticalCenter
                background : Image {
                    id: nextimage
                    width: parent.width
                    height: parent.height
                    source: "images/next.png"
                }

                onClicked:{
                    if(swipeView.currentIndex<3)
                        swipeView.currentIndex++
                }
            }




}



/*##^##
Designer {
    D{i:0;autoSize:true;height:480;width:640}
}
##^##*/
