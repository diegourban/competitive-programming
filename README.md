# Algorithms
[![build](https://github.com/diegourban/competitive-programming/actions/workflows/build.yml/badge.svg?branch=master)](https://github.com/diegourban/competitive-programming/actions/workflows/build.yml)
[![codecov](https://codecov.io/gh/diegourban/competitive-programming/branch/master/graph/badge.svg)](https://codecov.io/gh/diegourban/competitive-programming)

A small Java library of algorithms and data structures, plus worked problems organised by topic that show them in use.

## Build

Requires Java 25. Maven comes with the wrapper.

```sh
./mvnw verify          # compile, run all tests, write coverage to target/site/jacoco
./mvnw install         # make io.github.diegourban:algorithms available to other local projects
```

## Layout

```
src/main/java/io/github/diegourban/algorithms/
  datastructure/   array, binarytree, graph, linkedlist, queue, set, stack, trie, vector
  io/              Reader: fast tokenising stdin reader for judge-style input
  math/            Algebra (gcd, lcm, primes, factorisation), Combinatorics, Geometry, Numbers, Statistics
  search/          BinarySearch
  sorting/         Insertion, Merge, Quick and Selection sort
  string/          StringUtils

src/test/java/io/github/diegourban/algorithms/
  <same packages>  unit tests for the library
  problems/<topic> worked problems (see below)
  testing/         SampleBuilder, SampleLoader: helpers for judge-style tests
```

## Problems

Each problem is one test class, `problems/<topic>/<Name>Test.java`:

- The Javadoc gives the title, the source (beecrowd/URI, Codewars, SPOJ, Interview Cake) and a link, plus a line on the approach and its complexity.
- `static solve(...)` is a pure function on typed inputs, and the unit tests call it directly.
- Problems with judge sample files also have a `static String run(InputStream)` adapter (`Reader` → `solve` → judge-formatted output). A parameterised test replays every `.in`/`.out` pair from `src/test/resources/problems/<topic>/<name>/` through it.

Topics: `bit`, `datastructure.{array,map,set,stack}`, `greedy`, `math`, `recursion`, `search`, `simulation`, `sorting`, `string`.

The original per-judge solutions (URI Online Judge, Codewars, SPOJ) are preserved at the git tag [`archive/judges-2018`](https://github.com/diegourban/competitive-programming/tree/archive/judges-2018).
