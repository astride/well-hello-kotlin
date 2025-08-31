# well-hello-kotlin
A project I'm using to start learning about [Kotlin](https://kotlinlang.org/).

In the beginning, I plan on solving simple Kotlin exercises found on [Exercism](https://exercism.org/) and [Kotlin Koans](https://play.kotlinlang.org/koans/overview).

I am coming from C#, and aim to populate my _Kotlin from C#_ cheat sheet below as I advance through the exercises.

# Kotlin from C# – Cheat sheet

## Function/Method

### Signature structure

<blockquote>
Kotlin

```kotlin
fun functionName(inputName: InputType): ReturnType {
  ...
}
```
</blockquote>

<blockquote>
C#

```csharp
ReturnType MethodName(InputType inputName)
{
  ...
}
```
</blockquote>

#### Example

<blockquote>
Kotlin

```kotlin
fun equalsOne(number: Int): Boolean {
  return number == 1
}
```
</blockquote>

<blockquote>
C#

```csharp
bool EqualsOne(int number)
{
  return number == 1;
}
```
</blockquote>

When a function/method does not return anything, `ReturnType` is omitted in Kotlin:

<blockquote>
Kotlin

```kotlin
fun doNothing() { }
```
</blockquote>

<blockquote>
C#

```csharp
void DoNothing() { }
```
</blockquote>

### Default arguments / Optional arguments

_Default arguments_ in Kotlin correspond to _optional arguments_ in C#. They are provided in the exact same way.

<blockquote>
  Kotlin

  ```kotlin
  fun equalsOne(number: Int = 1): Boolean {
    return number == 1
  }
  ```
</blockquote>

<blockquote>
  C#

  ```csharp
  bool EqualsOne(int number = 1)
  {
    return number == 1;
  }
  ```
</blockquote>

### Named arguments

_Named arguments_ exist in both Kotlin and C#.

<blockquote>
  Kotlin

  ```kotlin
  equalsOne(number = 0)
  ```
</blockquote>

<blockquote>
  C#

  ```csharp
  EqualsOne(number: 0)
  ```
</blockquote>

### Overriding properties and functions

#### Interface context

An `abstract` property or function residing inside an interface can be overridden using the `override` keyword.

A property that is not implemented inside the interface is automatically `abstract`.

<blockquote>
  Kotlin

  ```kotlin
  interface Animal() {
    val legCount: Int

    val isAlive: Boolean
      get() = true
  }
  ```
  ```kotlin
  class Giraffe : Animal {
    override val legCount: Int = 4
  }
  ```
</blockquote>

#### Class context

A property or function marked with the `open` keyword residing inside an inheritable class can be overridden using the `override` keyword.

<blockquote>
  Kotlin

  ```kotlin
  open class Animal() {
    open val legCount: Int = 0
  }
  ```
  ```kotlin
  class Giraffe : Animal() {
    override val legCount = 4
  }
  ```
</blockquote>

## Classes and objects

### Visibility modifiers / Access modifiers

_Visibility modifiers_ in Kotlin correspond to _access modifiers_ in C#. They are provided in the exact same way to classes, objects, interfaces, constructors, functions and properties (and their setters).

Visibility modifiers available in Kotlin are:
- `private`   &rarr; <small>visible within the file/class</small>
- `protected` &rarr; <small>visible within the file/class/subclasses</small>
- `internal`  &rarr; <small>visible within the module (when the declaring class is visible)</small>
- `public`    &rarr; <small>visible everywhere (when the declaring class is visible)</small> (default)

When overriding a class member without specifying the visibility, the visibility of the overridden member is inherited.

<blockquote>
  Kotlin

  ```kotlin
  fun showMeEverywhere() { }
  ```
  ```kotlin
  private fun hideMeOutside() { }
  ```
</blockquote>

### Inheritance

A class marked with the `open` keyword can be inherited.

<blockquote>
  Kotlin

  ```kotlin
  open class Animal { }
  ```

  ```kotlin
  class Giraffe : Animal() { }
  ```
</blockquote>
