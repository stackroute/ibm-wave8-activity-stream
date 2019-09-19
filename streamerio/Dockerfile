FROM node:12

WORKDIR /app

COPY . .

RUN npm install

RUN npm install http-server -g

RUN npm run build

WORKDIR /app/dist/streamerio

CMD ["http-server", "-c1", "--port", "8080"]
