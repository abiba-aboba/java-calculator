# 1. Базовый образ. Используем легкую версию Java 21 (Alpine Linux)
FROM eclipse-temurin:21-jre-alpine

# 2. Создаем точку монтирования для временных файлов
VOLUME /tmp

# 3. Копируем собранный JAR-файл внутрь контейнера
# Имя 'app.jar' будет финальным именем приложения в контейнере
COPY target/*.jar app.jar

# 4. Команда запуска приложения
ENTRYPOINT ["java", "-jar", "/app.jar"]