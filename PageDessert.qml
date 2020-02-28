import QtQuick 2.12
import QtQuick.Controls 2.5

Page{
    header: Label {
        text: qsTr("")
        padding: 0
        height : 0
    }

    Label {
        text: qsTr("")
        anchors.centerIn: parent
    }
    SwipeView {

        id: swipeView
        width: parent.width
        height: parent.height *0.95
        currentIndex: indicator.currentIndex


        Item {
            id: dessertPage1

            Grid {
                id: dessertGrid1
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
                            source: "images/menu/dessert/JipieHabaneroL.jpg"
                            fillMode: Image.PreserveAspectFit
                        }

                        Text {
                            id: name1
                            text: qsTr("지파이하바네로(L)")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price1
                            text: qsTr("4300")
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
                            source: "images/menu/dessert/JipieS.jpg"
                            fillMode: Image.PreserveAspectFit
                        }

                        Text {
                            id: name2
                            text: qsTr("지파이고소한맛(S)")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price2
                            text: qsTr("3400")
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
                            source: "images/menu/dessert/ChickenNugget.jpg"
                            fillMode: Image.PreserveAspectFit
                        }

                        Text {
                            id: name3
                            text: qsTr("치킨너겟")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price3
                            text: qsTr("1200")
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
                            source: "images/menu/dessert/LongCheeseStick.jpg"
                            fillMode: Image.PreserveAspectFit
                        }

                        Text {
                            id: name4
                            text: qsTr("롱치즈스틱")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price4
                            text: qsTr("1800")
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
                            source: "images/menu/dessert/CornSalad.jpg"
                            fillMode: Image.PreserveAspectFit
                        }

                        Text {
                            id: name5
                            text: qsTr("콘샐러드")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price5
                            text: qsTr("1700")
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
                            source: "images/menu/dessert/SundayStrawberry.jpg"
                            fillMode: Image.PreserveAspectFit
                        }

                        Text {
                            id: name6
                            text: qsTr("선데아이스크림(스트로베리)")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price6
                            text: qsTr("1500")
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
                            source: "images/menu/dessert/ShakeShakeChilly.jpg"
                            fillMode: Image.PreserveAspectFit
                        }

                        Text {
                            id: name7
                            text: qsTr("쉑쉑치킨(칠리)")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price7
                            text: qsTr("2500")
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
                            source: "images/menu/dessert/ShakeShakeCheese.jpg"
                            fillMode: Image.PreserveAspectFit
                        }

                        Text {
                            id: name8
                            text: qsTr("쉑쉑치킨(치즈)")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price8
                            text: qsTr("2500")
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
                            source: "images/menu/dessert/ShakeShakeOnion.jpg"
                            fillMode: Image.PreserveAspectFit
                        }

                        Text {
                            id: name9
                            text: qsTr("쉑쉑치킨(어니언)")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price9
                            text: qsTr("2500")
                            topPadding: 3
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }
                    }
                }

            }

        }

        Item {
            id: dessertPage2
            x: -1
            y: 0
            Grid {
                id: dessertGrid2
                x: 0
                y: 0
                width: parent.width * 0.85
                height: parent.height * 0.85
                spacing: 1
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
                            source: "images/menu/dessert/SeasonedPotato.jpg"
                            fillMode: Image.PreserveAspectFit
                            anchors.horizontalCenter: parent.horizontalCenter
                        }

                        Text {
                            id: name10
                            text: qsTr("양념감자")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price10
                            text: qsTr("2000")
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
                            source: "images/menu/dessert/SquidRing.png"
                            fillMode: Image.PreserveAspectFit
                            anchors.horizontalCenter: parent.horizontalCenter
                        }

                        Text {
                            id: name11
                            text: qsTr("오징어링")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price11
                            text: qsTr("2200")
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
                            source: "images/menu/dessert/CheeseStickOriginal.jpg"
                            fillMode: Image.PreserveAspectFit
                            anchors.horizontalCenter: parent.horizontalCenter
                        }

                        Text {
                            id: name12
                            text: qsTr("치즈스틱")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price12
                            text: qsTr("2000")
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
                            source: "images/menu/dessert/Potato.jpg"
                            fillMode: Image.PreserveAspectFit
                            anchors.horizontalCenter: parent.horizontalCenter
                        }

                        Text {
                            id: name13
                            text: qsTr("포테이토")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price13
                            text: qsTr("1500")
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
                            source: "images/menu/dessert/ChocoCookieTornado.jpg"
                            fillMode: Image.PreserveAspectFit
                            anchors.horizontalCenter: parent.horizontalCenter
                        }

                        Text {
                            id: name14
                            text: qsTr("토네이도(초코쿠키)")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price14
                            text: qsTr("2300")
                            topPadding: 3
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }
                    }
                }

                Button {
                    id: button15
                    width: parent.width * 0.33
                    height: parent.height * 0.33
                    text: qsTr("")
                    background: Rectangle {
                        color: "#ffffff"
                    }
                    Column {
                        id: column15
                        x: 0
                        y: 0
                        width: parent.width
                        height: parent.height
                        Image {
                            id: image15
                            width: parent.width * 0.9
                            height: parent.height * 0.5
                            source: "images/menu/dessert/GreenTeaTornado.jpg"
                            fillMode: Image.PreserveAspectFit
                            anchors.horizontalCenter: parent.horizontalCenter
                        }

                        Text {
                            id: name15
                            text: qsTr("토네이도(녹차)")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price15
                            text: qsTr("2300")
                            topPadding: 3
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }
                    }
                }

                Button {
                    id: button16
                    width: parent.width * 0.33
                    height: parent.height * 0.33
                    text: qsTr("")
                    background: Rectangle {
                        color: "#ffffff"
                    }
                    Column {
                        id: column16
                        x: 0
                        y: 0
                        width: parent.width
                        height: parent.height
                        Image {
                            id: image16
                            width: parent.width * 0.9
                            height: parent.height * 0.5
                            source: "images/menu/dessert/StrawberryTornado.jpg"
                            fillMode: Image.PreserveAspectFit
                            anchors.horizontalCenter: parent.horizontalCenter
                        }

                        Text {
                            id: name16
                            text: qsTr("토네이도(스트로베리)")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price16
                            text: qsTr("2400")
                            topPadding: 3
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }
                    }
                }

                Button {
                    id: button17
                    width: parent.width * 0.33
                    height: parent.height * 0.33
                    text: qsTr("")
                    background: Rectangle {
                        color: "#ffffff"
                    }
                    Column {
                        id: column17
                        x: 0
                        y: 0
                        width: parent.width
                        height: parent.height
                        Image {
                            id: image17
                            width: parent.width * 0.9
                            height: parent.height * 0.5
                            source: "images/menu/dessert/SoftCone.jpg"
                            fillMode: Image.PreserveAspectFit
                            anchors.horizontalCenter: parent.horizontalCenter
                        }

                        Text {
                            id: name17
                            text: qsTr("소프트콘")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price17
                            text: qsTr("700")
                            topPadding: 3
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }
                    }
                }

                Button {
                    id: button18
                    width: parent.width * 0.33
                    height: parent.height * 0.33
                    text: qsTr("")
                    background: Rectangle {
                        color: "#ffffff"
                    }
                    Column {
                        id: column18
                        x: 0
                        y: 0
                        width: parent.width
                        height: parent.height
                        Image {
                            id: image18
                            width: parent.width * 0.9
                            height: parent.height * 0.5
                            source: ""
                            fillMode: Image.PreserveAspectFit
                            anchors.horizontalCenter: parent.horizontalCenter
                        }

                        Text {
                            id: name18
                            text: qsTr("")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price18
                            text: qsTr("")
                            topPadding: 3
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }
                    }
                }
                anchors.verticalCenter: parent.verticalCenter
                anchors.horizontalCenter: parent.horizontalCenter
                rows: 3
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




        Button{
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
