from dominio.Shape import Shape

class Square(Shape):
    def __init__(self, side_size):
        self.side_size = side_size

    def area(self):
        return self.side_size**2

    def perimeter(self):
        return 4 * self.side_size

    def type(self):
        return 'square'