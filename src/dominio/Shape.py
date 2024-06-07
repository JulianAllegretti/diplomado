class Shape:
    def area(self):
        raise NotImplementedError("Subclasses must implement area method")

    def perimeter(self):
        raise NotImplementedError("Subclasses must implement perimeter method")

    def type(self):
        raise NotImplementedError("Subclasses must implement type method")