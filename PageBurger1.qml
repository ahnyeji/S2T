import QtQuick 2.12
import QtQuick.Controls 2.5

Item {
    id: element2
    Grid {
        id: grid1
        x: 0
        y: 0
        width: parent.width * 0.95
        height: parent.height * 0.95
        spacing: 1
        columns: 3
        Button {
            id: button15
            width: parent.width * 0.33
            height: parent.height * 0.33
            text: qsTr("")
            Column {
                id: column4
                x: 0
                y: 0
                width: parent.width
                height: parent.height
                Image {
                    id: image2
                    width: 100
                    height: 100
                    source: "images/1.png"
                    fillMode: Image.PreserveAspectFit
                    anchors.horizontalCenter: parent.horizontalCenter
                }

                Text {
                    id: element5
                    text: qsTr("ë¶ˆê³ ê¸°ë²„ê±°")
                    anchors.horizontalCenter: parent.horizontalCenter
                    font.pixelSize: 12
                }

                Text {
                    id: element6
                    text: qsTr("2500")
                    anchors.horizontalCenter: parent.horizontalCenter
                    font.pixelSize: 12
                }
            }
            background: Rectangle {
                color: "#ffffff"
            }
        }

        Button {
            id: button16
            width: parent.width * 0.33
            height: parent.height * 0.33
            text: qsTr("Button")
        }

        Button {
            id: button17
            width: parent.width * 0.33
            height: parent.height * 0.33
            text: qsTr("Button")
        }

        Button {
            id: button18
            width: parent.width * 0.33
            height: parent.height * 0.33
            text: qsTr("Button")
        }

        Button {
            id: button19
            width: parent.width * 0.33
            height: parent.height * 0.33
            text: qsTr("Button")
        }

        Button {
            id: button20
            width: parent.width * 0.33
            height: parent.height * 0.33
            text: qsTr("Button")
        }

        Button {
            id: button21
            width: parent.width * 0.33
            height: parent.height * 0.33
            text: qsTr("Button")
        }

        Button {
            id: button22
            width: parent.width * 0.33
            height: parent.height * 0.33
            text: qsTr("Button")
        }

        Button {
            id: button23
            width: parent.width * 0.33
            height: parent.height * 0.33
            text: qsTr("Button")
        }
        anchors.verticalCenter: parent.verticalCenter
        anchors.horizontalCenter: parent.horizontalCenter
        rows: 3
    }
}



