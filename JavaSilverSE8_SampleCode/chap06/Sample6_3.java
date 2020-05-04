class SuperA { }                        // スーパークラスA
final class SuperB { }                  // スーパークラスB
class SuperC { void print(){ } }        // スーパークラスC
class SuperD { final void print(){ } }  // スーパークラスD

class SubA extends SuperA { }                   // サブクラスA // OK
//class SubB extends SuperB { }                 // サブクラスB // NG
class SubC extends SuperC { void print(){ } }   // サブクラスC // OK
//class SubD extends SuperD { void print(){ } } // サブクラスD // NG
