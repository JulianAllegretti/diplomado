from dominio.Circle import Circle
from dominio.Square import Square

shapes = []
circle_1 = Circle(10)
circle_2 = Circle(20)
square_1 = Square(12)
square_2 = Square(21)
shapes.extend((circle_1, circle_2, square_1, square_2))

for shape in shapes:
    print("The parameter for {0} is {1:.2f} and the Area for {0} is {2:.2f}".format(shape.type(), shape.perimeter(), shape.area()))