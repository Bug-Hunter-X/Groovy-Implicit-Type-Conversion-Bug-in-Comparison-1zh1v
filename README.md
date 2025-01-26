# Groovy Implicit Type Conversion Bug

This repository demonstrates a subtle bug in Groovy related to implicit type conversion during comparisons. The `myMethod` function aims to return the larger of two inputs, but due to Groovy's flexible typing, unexpected behavior can occur when comparing dissimilar types.  The solution offers a more robust approach to handle various input types and ensures accurate comparisons.

## Bug Description:
The original `myMethod` uses implicit type conversion, which can lead to unexpected results if the inputs are of different types (e.g., comparing an Integer and a String).

## Solution:
The improved version of `myMethod` explicitly checks the types of inputs before comparison. This addresses the potential for inconsistent behavior and improves the robustness of the function.