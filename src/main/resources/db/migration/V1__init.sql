CREATE TABLE IF NOT EXISTS customer (
                          id SERIAL PRIMARY KEY,
                          name VARCHAR(255) NOT NULL,
                          type VARCHAR(20) NOT NULL,
                          created_at TIMESTAMP NULL DEFAULT NULL,
                          updated_at TIMESTAMP NULL DEFAULT NULL,
                          balance INTEGER DEFAULT 0
);

CREATE TABLE IF NOT EXISTS product (
                         id SERIAL PRIMARY KEY,
                         title VARCHAR(255) NOT NULL,
                         price DECIMAL NOT NULL,
                         tax DECIMAL NOT NULL,
                         created_at TIMESTAMP DEFAULT NULL,
                         updated_at TIMESTAMP DEFAULT NULL,
                         customer_id INTEGER NOT NULL REFERENCES customer(id)
);
