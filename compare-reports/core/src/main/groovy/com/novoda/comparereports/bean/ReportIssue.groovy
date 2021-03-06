package com.novoda.comparereports.bean

class ReportIssue {

    final ReportFile file
    final Number line
    final Number column
    final String severity
    final String message
    final String source

    ReportIssue(ReportFile file, Number line, Number column, String severity, String message, String source) {
        this.file = file
        this.line = line
        this.column = column
        this.severity = severity
        this.message = message
        this.source = source
    }

    Issue toIssue() {
        new Issue(line, column, severity, message, source)
    }


    @Override
    public String toString() {
        return "ReportIssue{" +
                "file=" + file +
                ", line=" + line +
                ", column=" + column +
                ", severity='" + severity + '\'' +
                ", message='" + message + '\'' +
                ", source='" + source + '\'' +
                '}';
    }

    boolean equals(o) {
        if (this.is(o)) return true
        if (getClass() != o.class) return false

        ReportIssue that = (ReportIssue) o

        if (column != that.column) return false
        if (file != that.file) return false
        if (line != that.line) return false
        if (message != that.message) return false
        if (severity != that.severity) return false
        if (source != that.source) return false

        return true
    }

    int hashCode() {
        int result
        result = file.hashCode()
        result = 31 * result + line.hashCode()
        result = 31 * result + column.hashCode()
        result = 31 * result + severity.hashCode()
        result = 31 * result + message.hashCode()
        result = 31 * result + source.hashCode()
        return result
    }
}
