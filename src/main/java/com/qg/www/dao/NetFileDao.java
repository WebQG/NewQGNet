package com.qg.www.dao;

import com.qg.www.models.NetFile;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 文件类的dao层接口
 * @author net
 * @version 1.2
 */
public interface NetFileDao {
    /**
     * 模糊搜索文件；
     * @param keyWord 关键字；
     * @return 文件列表；
     */
    List<NetFile> searchFile(String keyWord);
    /**
     * 添加文件或者文件夹
     *
     * @param netFile 文件名、用户名、用户ID、父目录ID、路径、最后修改时间、文件大小
     * @return 是否成功添加；
     */
    boolean addFile(NetFile netFile);

    /**
     *
     * 得到当前文件目录下的文件列表
     *
     * @param fileId 当前文件目录的ID
     * @return 当前文件目录下的所有文件列表
     */
    List<NetFile> listFile(int fileId);

    /**
     *
     * 删除文件或文件夹
     *
     * @param fileId 文件或文件夹的ID
     * @return 是否删除成功
     */
    boolean deleteFile(int fileId);

    /**
     *
     * 通过fileId找到创建该文件的用户ID
     *
     * @param fileId 文件或文件夹ID
     * @return 创建其的用户ID
     */
    int getUserId(int fileId);

    /**
     * 通过文件ID，找出父目录ID；
     * @param fileId
     * @return
     */
    int getDirectoryByFileId(int fileId);

    /**
     * 重命名文件
     *
     * @param fileId      文件ID
     * @param newFileName  新的文件名
     * @return 是否成功修改
     */
    boolean modifyFileName(@Param("fileId") int fileId, @Param("newFileName") String newFileName);
    /**
     *
     * 用户下载时使文件下载量加1
     *
     * @param realPath 文件的绝对路径
     * @return 是否增加成功
     */
    boolean updateDownloadTimes(String realPath);

    /**
     * 排序浏览文件；
     * @param fatherId 父目录ID
     * @param type 排序方式；
     * @return 文件列表；
     */
    List<NetFile >listSortedFile( int fatherId, String type);

    /**
     * 通过文件ID获取文件
     * @param fileId 文件ID
     * @return 文件；
     */
    NetFile getFileById(int fileId);
}
