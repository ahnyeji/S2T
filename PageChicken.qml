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
            id: chickenPage1

            Grid {
                id: chickenGrid1
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
                            source: "images/menu/chicken/FriedChicken.jpg"
                            fillMode: Image.PreserveAspectFit
                        }

                        Text {
                            id: name1
                            text: qsTr("치킨1조각")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price1
                            text: qsTr("2,300")
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
                            source: "images/menu/chicken/ChickenFillet2.jpg"
                            fillMode: Image.PreserveAspectFit
                        }

                        Text {
                            id: name2
                            text: qsTr("치킨휠레(2조각)")
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
                            source: "images/menu/chicken/FireWing2.jpg"
                            fillMode: Image.PreserveAspectFit
                        }

                        Text {
                            id: name3
                            text: qsTr("화이어윙(2조각)")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price3
                            text: qsTr("2,500")
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
                            source: "images/menu/chicken/ChickenFillet4.jpg"
                            fillMode: Image.PreserveAspectFit
                        }

                        Text {
                            id: name4
                            text: qsTr("치킨휠레(4조각)")
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
                            source: "images/menu/chicken/FireWing4.jpg"
                            fillMode: Image.PreserveAspectFit
                        }

                        Text {
                            id: name5
                            text: qsTr("화이어윙(4조각)")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price5
                            text: qsTr("4,500")
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
                            source: "images/menu/chicken/LeanMeatHalfPack.jpg"
                            fillMode: Image.PreserveAspectFit
                        }

                        Text {
                            id: name6
                            text: qsTr("순살치킨 하프팩")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price6
                            text: qsTr("8,900")
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
                            source: "images/menu/chicken/HalfPack.jpg"
                            fillMode: Image.PreserveAspectFit
                        }

                        Text {
                            id: name7
                            text: qsTr("치킨하프팩")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price7
                            text: qsTr("9,300")
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
                            source: "images/menu/chicken/FamilyPack.jpg"
                            fillMode: Image.PreserveAspectFit
                        }

                        Text {
                            id: name8
                            text: qsTr("패밀리팩")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price8
                            text: qsTr("13,600")
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
                            source: "images/menu/chicken/LeanMeatFullPack.jpg"
                            fillMode: Image.PreserveAspectFit
                        }

                        Text {
                            id: name9
                            text: qsTr("순살치킨 풀팩")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price9
                            text: qsTr("15,900")
                            topPadding: 3
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }
                    }
                }

            }

        }

        Item {
            id: chickenPage2
            x: -1
            y: 0
            Grid {
                id: chickenGrid2
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
                            source: "images/menu/chicken/FullPack.jpg"
                            fillMode: Image.PreserveAspectFit
                            anchors.horizontalCenter: parent.horizontalCenter
                        }

                        Text {
                            id: name10
                            text: qsTr("치킨풀팩")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price10
                            text: qsTr("18,800")
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
                            source: ""
                            fillMode: Image.PreserveAspectFit
                            anchors.horizontalCenter: parent.horizontalCenter
                        }

                        Text {
                            id: name11
                            text: qsTr("")
                            topPadding: 5
                            anchors.horizontalCenter: parent.horizontalCenter
                            font.pixelSize: 14
                        }

                        Text {
                            id: price11
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

