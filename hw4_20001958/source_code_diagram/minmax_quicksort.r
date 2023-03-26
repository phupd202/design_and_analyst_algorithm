size = c(1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384)
time = c(4800, 25300, 7200, 17800, 27500, 62300, 147400, 152700, 756700, 910300, 426900, 1228800, 4638400, 9492400, 25658400)

data = data.frame(size, time)

plot(data, xlab = "Kích cỡ n", ylab = "Thời gian (nano giây)", main = "Tìm min max bằng thuật toán quick sort")
lines(size, time)