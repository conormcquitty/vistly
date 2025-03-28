CREATE TABLE users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    email_id VARCHAR(255),
    profile_image_url VARCHAR(255),
    locality VARCHAR(255),
    administrative_area VARCHAR(255),
    country VARCHAR(255)
);