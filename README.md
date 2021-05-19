# Lab 01
Name: Adhish Maheswarna
Student #: 300133918
Course: SEG3103
Professor: Andrew Forward

### Java

proof that I'm running Java with a screenshot from terminal


<img width="585" alt="image" src="https://user-images.githubusercontent.com/36574103/118892558-0fef1580-b8cf-11eb-890b-d999d85d3b4d.png">

I got cd into the folder containing newmath_java and to run the Java program (in `newmath_java`) I use

```bash
javac -encoding UTF-8 --source-path src -d dist src/*.java
```

Then I run it

```bash
java -cp ./dist Main
```

Here is an output of the running program

```bash
Newmath (type 'exit' to exit program)
Numerator: 30
Demoninator: 60
30 / 60 = 0
Numerator: exit
```

With a screenshot from the terminal

<img width="585" alt="image" src="https://user-images.githubusercontent.com/36574103/118894075-8e4cb700-b8d1-11eb-8c1c-53f35e01d022.png">

### JUnit

I am working with JUnit 5 (via Console standalone 1.7.1)

To run JUnit, I need to compile the application (see above), and then compile the test code

```bash
javac -encoding UTF-8 --source-path test -d dist -cp dist:lib/junit-platform-console-standalone-1.7.1.jar test/*.java
```

Then I run the tests using

```
java -jar lib/junit-platform-console-standalone-1.7.1.jar --class-path dist --scan-class-path
```

Here is the output of the tests

```bash
Thanks for using JUnit! Support its development at https://junit.org/sponsoring

╷
├─ JUnit Jupiter ✔
│  └─ NewmathTest ✔
│     ├─ div_ok() ✔
│     └─ div_by_zero() ✔
└─ JUnit Vintage ✔

Test run finished after 32 ms
[         3 containers found      ]
[         0 containers skipped    ]
[         3 containers started    ]
[         0 containers aborted    ]
[         3 containers successful ]
[         0 containers failed     ]
[         2 tests found           ]
[         0 tests skipped         ]
[         2 tests started         ]
[         0 tests aborted         ]
[         2 tests successful      ]
[         0 tests failed          ]
```

With a screenshot from the terminal

![Running JUnit in the console](assets/junit_main.png)


### Elixir

I am running Elixir 11.4 with Erlang 23

```bash
$ elixir --version
Erlang/OTP 23 [erts-11.1.7] [source] [64-bit] [smp:8:8] [ds:8:8:10] [async-threads:1] [dtrace]

Elixir 1.11.4 (compiled with Erlang/OTP 23)
```

To run the Elixir program (in `newmath_ex`), first I compile it

```bash
mix compile
```

Then I run it

```bash
iex -S mix
```

Here is an output of the running program

```elixir
iex(1)> NewmathEx.
MixProject    div/2
iex(1)> NewmathEx.div(10, 2)
{:ok, 5.0}
```

With a screenshot from the terminal

![Running Elixir in the console](assets/elixir_iex.png)

### ExUnit

ExUnit is built directly into Elixir (and compiled like above with `mix compile`)

To run the tests

```
mix test
```

Here is the output of the tests

```bash
Compiling 1 file (.ex)
...

Finished in 0.02 seconds
1 doctest, 2 tests, 0 failures

Randomized with seed 975082
```

With a screenshot from the terminal

![Running ExUnit in the console](assets/exunit_main.png)

