package Pert8;

interface AksesSistem {
    void login(String pin);
    void logout();
    default String getRoleAkses() {
        return "Staff Biasa";
    }
}
