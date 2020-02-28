import QtQuick 2.12
import QtQuick.Controls 2.5

Page{
    id: page
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
            id: burgerPage1

            Grid {
                id: burgerGrid1
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
                            source: ""
                            fillMode: Image.PreserveAspectFit
                        }

                        Text {
                            id: name1
                            text: qsTr("AZ버거")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price1
                            text: qsTr("6,600")
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
                            source: "qrc:/images/menu/burger/BigBulgogi.jpg"
                            fillMode: Image.PreserveAspectFit
                        }

                        Text {
                            id: name2
                            text: qsTr("원조 빅불")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price2
                            text: qsTr("5,800")
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
                            source: "qrc:/images/menu/burger/Bulgogi.jpg"
                            fillMode: Image.PreserveAspectFit
                        }

                        Text {
                            id: name3
                            text: qsTr("불고기버거")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price3
                            text: qsTr("3,900")
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
                            source: "qrc:/images/menu/burger/ChickenBurger.jpg"
                            fillMode: Image.PreserveAspectFit
                        }

                        Text {
                            id: name4
                            text: qsTr("치킨버거")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price4
                            text: qsTr("2,900")
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
                            source: "qrc:/images/menu/burger/ClassicCheese.jpg"
                            fillMode: Image.PreserveAspectFit
                        }

                        Text {
                            id: name5
                            text: qsTr("클래식 치즈버거")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price5
                            text: qsTr("4,400")
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
                            source: "qrc:/images/menu/burger/DoubleX2.jpg"
                            fillMode: Image.PreserveAspectFit
                        }

                        Text {
                            id: name6
                            text: qsTr("더블X2")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price6
                            text: qsTr("5,500")
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
                            source: "qrc:/images/menu/burger/HanwooBulgogi.jpg"
                            fillMode: Image.PreserveAspectFit
                        }

                        Text {
                            id: name7
                            text: qsTr("한우불고기")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price7
                            text: qsTr("7,000")
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
                            source: "qrc:/images/menu/burger/HotCrispyChicken.jpg"
                            fillMode: Image.PreserveAspectFit
                        }

                        Text {
                            id: name8
                            text: qsTr("핫크리스피버거")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price8
                            text: qsTr("4,900")
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
                            source: "qrc:/images/menu/burger/MozzarellaBacon.jpg"
                            fillMode: Image.PreserveAspectFit
                        }

                        Text {
                            id: name9
                            text: qsTr("모짜렐라 인 더 버거 베이컨")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price9
                            text: qsTr("6,000")
                            topPadding: 3
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }
                    }
                }

            }

        }

        Item {
            id: burgerPage2
            x: -1
            y: 0
            Grid {
                id: burgerGrid2
                x: 0
                y: 0
                width: parent.width * 0.85
                height: parent.height * 0.85
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
                            source: "qrc:/images/menu/burger/Shrimp.jpg"
                            fillMode: Image.PreserveAspectFit
                            anchors.horizontalCenter: parent.horizontalCenter
                        }

                        Text {
                            id: name10
                            text: qsTr("새우버거")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price10
                            text: qsTr("3,900")
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
                            source: "qrc:/images/menu/burger/Teri.jpg"
                            fillMode: Image.PreserveAspectFit
                            anchors.horizontalCenter: parent.horizontalCenter
                        }

                        Text {
                            id: name11
                            text: qsTr("데리버거")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price11
                            text: qsTr("2,500")
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
                            source: "qrc:/images/menu/burger/TREX.jpg"
                            fillMode: Image.PreserveAspectFit
                            anchors.horizontalCenter: parent.horizontalCenter
                        }

                        Text {
                            id: name12
                            text: qsTr("T-Rex버거")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price12
                            text: qsTr("3,700")
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
                            source: "qrc:/images/menu/burger/WagyuEdition2.jpg"
                            fillMode: Image.PreserveAspectFit
                            anchors.horizontalCenter: parent.horizontalCenter
                        }

                        Text {
                            id: name13
                            text: qsTr("와규 에디션 II")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price13
                            text: qsTr("5,800")
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
                            source: "qrc:/images/menu/burger/RiaMiracle.jpg"
                            fillMode: Image.PreserveAspectFit
                            anchors.horizontalCenter: parent.horizontalCenter
                        }

                        Text {
                            id: name14
                            text: qsTr("리아미라클버거")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price14
                            text: qsTr("5,600")
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
                            source: ""
                            fillMode: Image.PreserveAspectFit
                            anchors.horizontalCenter: parent.horizontalCenter
                        }

                        Text {
                            id: name15
                            text: qsTr("")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price15
                            text: qsTr("")
                            topPadding: 3
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }
                    }
                }
                anchors.verticalCenter: parent.verticalCenter
                anchors.horizontalCenter: parent.horizontalCenter

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
                    source: "qrc:/images/back.png"
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
                    source: "qrc:/images/next.png"
                }

                onClicked:{
                    if(swipeView.currentIndex<3)
                        swipeView.currentIndex++
                }
            }




}

