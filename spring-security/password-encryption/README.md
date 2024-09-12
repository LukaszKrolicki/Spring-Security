# 🤯 Password Encryption

`BCrypt` is a widely-used algorithm for hashing passwords, known for its security and resistance to brute-force attacks. It includes a built-in mechanism for salting passwords, which makes it particularly secure.

#### How BCrypt Hashing Works:

1. **Salting**:
   * **Salts** are random values added to the password before hashing. This ensures that even if two users have the same password, their hashes will be different.
   * BCrypt generates a unique salt for each password hash.
2. **Hashing**:
   * The password and salt are combined and hashed using the BCrypt algorithm.
   * BCrypt uses a computationally expensive hashing function, which slows down brute-force attacks.
3. **Storing the Hash**:
   * The BCrypt hash includes the salt and the cost factor (which controls the computational cost of hashing).
   * The hash is stored in the database, and it is used to verify passwords during login.
