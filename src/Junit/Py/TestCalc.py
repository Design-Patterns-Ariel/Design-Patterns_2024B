import unittest
from Calc import Calculator


class TestCalculator(unittest.TestCase):
    
    def setUp(self):
        self.calc = Calculator()
        print("Before each test")

    def tearDown(self):
        self.calc = None
        print("After each test")

    @classmethod
    def setUpClass(self):
        print("Before all test")
        
    @classmethod
    def tearDownClass(self):
        print("After all test")

    def test_add(self):
        print("test_add")
        self.assertEqual(self.calc.add(2,2),4)


if __name__ == '__main__':
    unittest.main()
