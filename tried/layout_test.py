import sys
from PyQt5.QtWidgets import QApplication, QWidget, QPushButton, QHBoxLayout, QVBoxLayout, QTextBrowser


class MyApp(QWidget):

    def __init__(self):
        super().__init__()

        self.initUI()

    def initUI(self):
        # Text window
        self.txtbox = QTextBrowser()
        self.txtbox.setAcceptRichText(False)
        self.txtbox.setOpenExternalLinks(False)


        # Buttons
        self.start_btn = QPushButton('START')
        # self.start_btn.pressed.connect()
        self.pause_btn = QPushButton('PAUSE')
        # self.pause_btn.pressed.connect()
        self.stop_btn = QPushButton('STOP')
        # self.stop_btn.pressed.connect()

        # Button box (vertical buttons)
        self.btn_box = QVBoxLayout()
        self.btn_box.addWidget(self.start_btn)
        self.btn_box.addWidget(self.pause_btn)
        self.btn_box.addWidget(self.stop_btn)
        self.btn_box.addStretch(3)

        # Text box and Button box layout
        hbox = QHBoxLayout()
        hbox.addWidget(self.txtbox, 0)
        hbox.addLayout(self.btn_box, 1)

        self.setLayout(hbox)

        self.setWindowTitle('STT window')
        self.setGeometry(600, 600, 600, 400)
        self.show()


if __name__ == '__main__':

    app = QApplication(sys.argv)
    ex = MyApp()
    sys.exit(app.exec_())