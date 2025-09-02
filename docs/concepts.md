# Concepts

## Coroutines

Kotlin uses coroutines for asynchronous programming. Coroutines allow for efficient and fine-grained concurrency. They are lightweight, resource-friendly alternatives to threads.

### Features

- A coroutine is not bound to any particular thread.
- Coroutines need to be launched within a [`CoroutineScope`](https://kotlinlang.org/api/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/-coroutine-scope/), which is a holder of a [`CoroutineContext`](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.coroutines/-coroutine-context/).
  - `runBlocking { }` provides this context.
  - The lifetime of a coroutine is limited by the `CoroutineScope`.
- An outer scope completes after all its children coroutines complete.

### Libraries

- [`kotlinx.coroutines.*`](https://kotlinlang.org/api/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/)

### Functions

#### Coroutine builders

[`launch { }`](https://kotlinlang.org/api/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/launch.html) initiates a new coroutine concurrently with the rest of the code.
- You can `launch { }` a suspending function (e.g. `launch { doSomething() }` &larr; `suspend fun doSomething() { }`).

[`runBlocking { }`](https://kotlinlang.org/api/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/run-blocking.html) bridges the non-coroutine world and the coroutine world within its body.
- It runs a new coroutine and blocks the current thread until its completion.
- It is typically used at the top-level of the application (i.e. `fun main() = runBlocking { }`), and in test functions.

#### Suspending functions

[`delay( )`](https://kotlinlang.org/api/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/delay.html) delays a coroutine without blocking the underlying thread. It can be cancelled.

[`coroutineScope { }`](https://kotlinlang.org/api/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/coroutine-scope.html) creates a `CoroutineScope`.
- Its `coroutineContext` is inherited from the outer scope &rarr; the outer scope's `Job` is the parent for the new `Job`.
- It can be used from any suspending function (e.g. `suspend fun doSomething() => coroutineScope { ... }`).

#### General

Whereas `runBlocking { }` blocks the underlying thread, `coroutineScope { }` releases the underlying thread upon suspending.

### Objects

- A [`Job`](https://kotlinlang.org/api/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/-job/) is a background job. It can be cancelled.
