# Use the official PostgreSQL image from the Docker Hub
FROM postgres:latest

# Set environment variables for PostgreSQL
ENV POSTGRES_DB=pass_in
ENV POSTGRES_USER=user
ENV POSTGRES_PASSWORD=password

# Expose the default PostgreSQL port
EXPOSE 5432