#include <iostream>
class  Base {
    public:
    Base(int a) {
        std::cout << a + 1 << std::endl;
    }
};
class Sub : public Base {
    public:
    Sub(int a, double an) : Base((int)an) {
        std::cout << a + 2 << std::endl;
    }
};
int main() {
  Sub a(13, 14.0);

  return 0;
}
