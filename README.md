# algorithms-java
[![build](https://github.com/diegourban/algorithms-java/actions/workflows/build.yml/badge.svg?branch=master)](https://github.com/diegourban/algorithms-java/actions/workflows/build.yml)
[![codecov](https://codecov.io/gh/diegourban/algorithms-java/branch/master/graph/badge.svg)](https://codecov.io/gh/diegourban/algorithms-java)
[![Codacy Badge](https://app.codacy.com/project/badge/Grade/1d28104f2eb44f99a3cc3bfd7be501e1)](https://app.codacy.com/gh/diegourban/algorithms-java/dashboard?utm_source=gh&utm_medium=referral&utm_content=&utm_campaign=Badge_grade)

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
  datastructure/   array (shuffle), binarytree, linkedlist, queue, set, stack, vector
  io/              Reader: fast tokenising stdin reader for judge-style input
  math/            Algebra (gcd, lcm, primes, factorisation), Combinatorics, Geometry, Numbers, Statistics
  search/          BinarySearch.indexOf
  sorting/         Sorter interface: Insertion, Merge, Quick and Selection sort
  string/          StringUtils

src/test/java/io/github/diegourban/algorithms/
  <same packages>  unit tests for the library (*PropertyTest: jqwik property-based tests)
  problems/<topic> worked problems (see below)
  testing/         SampleBuilder, SampleLoader: helpers for judge-style tests
```

## Problems

Each problem is one test class, `problems/<topic>/<Name>Test.java`:

- The Javadoc gives the title, the source (beecrowd/URI, Codewars, SPOJ, Interview Cake, HackerRank) and a link, plus a line on the approach and its complexity.
- `static solve(...)` is a pure function on typed inputs, and the unit tests call it directly.
- Problems with judge sample files also have a `static String run(InputStream)` adapter (`Reader` → `solve` → judge-formatted output). A parameterised test replays every `.in`/`.out` pair from `src/test/resources/problems/<topic>/<name>/` through it.

Topics: `bit`, `datastructure.{array,graph,linkedlist,map,queue,set,stack,tree,trie}`, `dp`, `greedy`, `math`, `recursion`, `search`, `simulation`, `sorting`, `string`.

A problem's id is `<topic>/<kebab-name>` (e.g. `math/prime-generator`), the same in the resource folder and in any future `algorithms-<language>` sibling repo, so problems and their sample files port across languages one to one. This repo is the source of truth for the problem catalogue.

The original per-judge solutions (URI Online Judge, Codewars, SPOJ) are preserved at the git tag [`archive/judges-2018`](https://github.com/diegourban/algorithms-java/tree/archive/judges-2018).
