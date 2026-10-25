fun main() {
    // Membuat objek dari class StudentCard
    val mhs = StudentCard("2409020058", "Maulidya Amanda Pratiwi", "Teknologi Informasi")

    // Menampilkan properti dengan tanda titik
    println("NIM    : ${mhs.nim}")
    println("Nama   : ${mhs.nama}")
    println("Prodi  : ${mhs.prodi}")

    // Mengubah nilai property var
    mhs.nama = "lidya"
    println("Nama setelah diubah: ${mhs.nama}")

    // Computed property status (pakai if-else di get())
    println("Status awal: ${mhs.status}")

    // Memanggil method ambilSks()
    mhs.ambilSks(24)
    println("Setelah ambil 24 SKS: ${mhs.totalSks} SKS, status: ${mhs.status}")

    mhs.ambilSks(15)
    println("Setelah ambil 15 SKS: ${mhs.totalSks} SKS")

    // Ditolak karena 24 + 15 = 39, lebih dari 24
    mhs.ambilSks(10)
    println("Setelah ambil 10 SKS: ${mhs.totalSks} SKS")

    // Memanggil method ringkasan()
    println(mhs.ringkasan())
}