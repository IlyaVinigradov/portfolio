from PyQt6.QtGui import *
from PyQt6.QtCore import *
from PyQt6.QtWidgets import *
from pathlib import Path
from datetime import datetime


class Model(QWidget):
    """ Класс для обработки данных """

    def __init__(self, view):
        super().__init__()
        self.date_selected = None
        self.surname_list = list()
        self.view = view
        self.DIR = Path(__file__).resolve().parent  # путь до текущей папки

    def set_selected_date(self):
        """ получение даты из календаря и преобразование к строке """
        date = self.view.cal.selectedDate()
        self.date_selected = date.toString("yyyy:MM:dd")

    def set_surname_list(self) -> None:
        """ получение фамилий и преобразование в список """
        self.surname = self.view.surname.text()
        self.surname_list = self.surname.replace(' ', '').split(',')

    def take_info(self):
        """ один метод для вызова других методов по обработке разных данных """
        self.set_selected_date()
        self.set_surname_list()
