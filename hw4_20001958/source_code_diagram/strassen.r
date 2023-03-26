size = c(2, 4, 8, 16, 32, 64, 128, 256)
time = c(34000, 365800, 1184200, 4262500, 48447900, 411731700, 690013700, 4049021300)

data = data.frame(size, time)

plot(data, xlab = "Kích cỡ n", ylab = "Thời gian (nano giây)", main = "Thời gian thực hiện nhân 2 ma trận bằng phương pháp Strassen")
lines(size, time)
