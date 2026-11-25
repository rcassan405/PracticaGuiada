CREATE DATABASE IF NOT EXISTS springapp CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

USE springapp;

CREATE TABLE IF NOT EXISTS products (
  id INTEGER PRIMARY KEY,
  description VARCHAR(255),
  price DECIMAL(15,2)
);
CREATE INDEX products_description ON products(description);
