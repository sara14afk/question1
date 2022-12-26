num1 = input("Enter first number: ")

if not num1.isdigit():
    print("Error: First number is not a valid number.")
    exit()

num1 = int(num1)

print("1. +")
print("2. -")
print("3. *")
print("4. /")
print("5. ^")
print("6. %")

operation = input("Enter operation: ")

if not operation.isdigit() and operation not in "+-*/^%":
    print("Error: Invalid operation.")
    exit()

if operation.isdigit():
    operation = int(operation)

num2 = input("Enter second number: ")

if not num2.isdigit():
    print("Error: Second number is not a valid number.")
    exit()

num2 = int(num2)

if operation == 1:
    result = num1 + num2
elif operation == 2:
    result = num1 - num2
elif operation == 3:
    result = num1 * num2
elif operation == 4:
    result = num1 / num2
elif operation == 5:
    result = num1 ** num2
elif operation == 6:
    result = num1 % num2

print(f"Result: {result}")