import QtQuick 2.12
import QtQuick.Controls 2.5

Page{
    id: pageMainbar
    header: Label {
        text: qsTr("")
        padding: 0
        height: 0
    }
    Column {
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

