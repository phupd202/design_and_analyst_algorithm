size = c(2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384)
time = c(19100, 3400, 2500, 3700, 4200, 9900, 6600, 37900, 11900, 8600, 13500, 10300, 16800, 19300)

data = data.frame(size, time)

plot(data, xlab = "Kích cỡ n", ylab = "Thời gian (nano giây)", main = "Biểu đồ phụ thuộc thời gian và kích cỡ của thuật toán binary search")
lines(size, time)
