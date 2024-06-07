from dominio.Circle import Circle
from dominio.Square import Square
import pytest
def test_circle_area():
    circle = Circle(5)
    assert circle.area() == pytest.approx(78.54, 0.2)

def test_circle_perimeter():
    circle = Circle(5)
    assert circle.perimeter() == pytest.approx(31.42, 0.2)

def test_square_area():
    square = Square(4)
    assert square.area() == 16

def test_square_perimeter():
    square = Square(4)
    assert square.perimeter() == 16