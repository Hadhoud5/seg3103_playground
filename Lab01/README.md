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

To run JUnit I follow commands as listed by prof's read me file and T.A lab video
compile command:

```bash
javac -encoding UTF-8 --source-path test -d dist -cp dist:lib/junit-platform-console-standalone-1.7.1.jar test/*.java
```
run command:
```
java -jar lib/junit-platform-console-standalone-1.7.1.jar --class-path dist --scan-class-path
```

Here is the output of my test

```bash
Adhishs-MacBook-Pro:newmath_java adhishm$ java -jar lib/junit-platform-console-standalone-1.7.1.jar --class-path dist --scan-class-path

Thanks for using JUnit! Support its development at https://junit.org/sponsoring

╷
├─ JUnit Jupiter ✔
│  └─ NewmathTest ✔
│     ├─ div_ok() ✔
│     └─ div_by_zero() ✔
└─ JUnit Vintage ✔

Test run finished after 77 ms
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

With a screenshot from my terminal

<img width="645" alt="image" src="https://user-images.githubusercontent.com/36574103/118898114-cd7f0600-b8d9-11eb-8246-592d2ff8de25.png">



### Elixir

I am running Elixir 11.4 with Erlang 23

```bash
$ elixir --version
Erlang/OTP 24 [erts-12.0] [source] [64-bit] [smp:8:8] [ds:8:8:10] [async-threads:1] [jit] [dtrace]

Elixir 1.12.0 (compiled with Erlang/OTP 23)
```

Follow commands from Prof and T.A lab To run the Elixir program (in `newmath_ex`)

compile command:

```bash
mix compile
Compiling 1 file (.ex)
Generated newmath_ex app

```
run command:

```bash
iex -S mix
```

Here is an output of the running program

```elixir
$ iex -S mix
Erlang/OTP 24 [erts-12.0] [source] [64-bit] [smp:8:8] [ds:8:8:10] [async-threads:1] [jit] [dtrace]

Interactive Elixir (1.12.0) - press Ctrl+C to exit (type h() ENTER for help)
iex(1)> NewmathEx.div(16, 6)
{:ok, 2.6666666666666665}

```

With a screenshot from the terminal


<img width="702" alt="image" src="https://user-images.githubusercontent.com/36574103/118899606-197f7a00-b8dd-11eb-8a6e-4beef2065c90.png">


### ExUnit

Followed instructions to run on ExUnit 

run test command for ExUnit:

```
mix test
```

Here is the output of the tests

```bash
$ mix test
Compiling 1 file (.ex)
Generated newmath_ex app
...

Finished in 0.03 seconds (0.00s async, 0.03s sync)
1 doctest, 2 tests, 0 failures

Randomized with seed 147010

```

With a screenshot from the terminal

<img width="702" alt="image" src="https://user-images.githubusercontent.com/36574103/118899712-5ba8bb80-b8dd-11eb-96b7-0b1b3df6fe54.png">


The format of this readme follow the readme from Prof's repository, commands and images are still mine.
